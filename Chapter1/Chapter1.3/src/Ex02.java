
public class Ex02 {

    private int[] id;  // parent[i] = parent of i
    private int count = 0;     // number of components
    private int times = 0;

    public Ex02(int N) 
    {
    	count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) 
        {
            id[i] = i;
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
    	if (p != id[p])
    	{
    		times += 2;
    		return find(id[p]);
    	}
    	else
    		return p;
    }
  
    public void union(int p, int q) 
    {
    	count--;
        int pRoot = find(p);
        int qRoot = find(q);        
        
        if (pRoot == qRoot) 
        	return;
      
    	id[pRoot] = qRoot;
    	times++;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int N = StdIn.readInt();
		Ex02 uf = new Ex02(N);
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
