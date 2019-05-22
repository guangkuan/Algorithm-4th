
public class Ex03 {

    private int[] id;  // parent[i] = parent of i
    private int[] sz;
    private int count = 0;     // number of components
    private int times = 0;

    public Ex03(int N) 
    {
    	count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) 
        {
            id[i] = i;
            sz[i] = 1;
        }
    }
    
    public int count() 
    {
        return count;
    }
    
    public int times() 
    {
        return times;
    }

    public boolean connected(int p, int q) 
    {
        return find(p) == find(q);
    }
    
    public int find(int p) 
    {
        while (p != id[p])
        {
        	p = id[p];
        	times += 2;
        }
        
        return p;
    }
  
    public void union(int p, int q) 
    {
    	count--;
        int pRoot = find(p);
        int qRoot = find(q);        
        
        if (pRoot == qRoot) 
        	return;
        
        if (sz[pRoot] > sz[qRoot])
        {
        	id[qRoot] = pRoot;
        	sz[pRoot] += sz[qRoot];
        }
        else
        {
        	id[pRoot] = qRoot;
        	sz[qRoot] += sz[pRoot];
        }
        times += 2;
    }
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N = StdIn.readInt();
		Ex03 uf = new Ex03(N);
		while (!StdIn.isEmpty())
		{
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connected(p, q))
				continue;
			uf.union(p, q);
			StdOut.println(uf.times() + " times");
		}
		
		for (int i = 0; i < N; i++)
		{
			StdOut.print(uf.id[i] + " ");
		}
		StdOut.println();
		StdOut.println("total " + uf.times() + " times");
		StdOut.println(uf.count() + " components");

	}

}
