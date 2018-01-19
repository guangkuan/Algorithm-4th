public class Ex19
{
    public static long F(int N)
    {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }
    
    public static void main(String[] args)
    {
        long[] a = new long[99];
        for (int N = 0; N < 100; N++)
            a[N] = F(N);
    }
}