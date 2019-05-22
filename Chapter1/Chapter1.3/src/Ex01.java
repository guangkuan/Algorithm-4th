
public class Ex01 {

    private int[] id;  // parent[i] = parent of i
    private int count = 0;     // number of components
    private int times = 0;

    public Ex01(int N) 
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
    	times++;
        return id[p];
    }
  
    public void union(int p, int q) 
    {
    	count--;
        int pID = find(p);
        int qID = find(q);        
        
        if (pID == qID) 
        	return;
        
        for (int i = 0; i < id.length; i++)
        {
        	if (id[i] == pID)
        	{
        		id[i] = qID;
        		times += 2;
        	}	
        	else
        		times++;
        }
    }

	public static void main(String[] args) 
	{
		int N = StdIn.readInt();
		Ex01 uf = new Ex01(N);
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
