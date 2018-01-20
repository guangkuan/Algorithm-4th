public class Ex36
{
    public static int[] shuffle(int[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int r = i + StdRandom.uniform(N - i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
    }
    
    public static int[][] ShuffleTest(int M, int N)
    {
        int[] a = new int[M];
        int[][] b = new int[M][M];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                a[j] = j;
            a = shuffle(a);
            
            for (int k = 0; k < M; k++)
            {
                for (int l = 0; l < M; l++)
                {
                    if (a[k] == l)
                    {
                        b[k][l]++;
                    }
                }
            }
        }
        
        return b;
    }
    
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[][] b = new int[M][M];
        
        b = ShuffleTest(M, N);
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.printf("%5d ", b[i][j]);
            }
            System.out.println();
        }
    }
}
        
        
            