public class Ex30 {
    public static int euclid(int p, int q) 
    {
        if (p == 0 || q == 0) 
        {
            return 2;
        }
        if (p < q) 
        {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q == 0) 
        {
            return q;
        } 
        else 
        {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) 
    {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                boolean b = (euclid(i, j) > 1 ? true : false);
                if (b)
                    a[i][j] = true;
                else
                    a[i][j] = false;
                
                System.out.printf("%-6s", a[i][j]);
            }
            System.out.println();
        }
    }
}