import java.util.Arrays;
public class Ex29
{
    public static int count(int[] a, int M) 
    {
        int n = a[a.length - 1];
        int[] result = new int[n + 1];
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] >= 0) 
            {
                result[a[i]]++;
            }
        }
        return result[a[M]];
    }
    
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        for (int i = 0; i < whitelist.length; i++)
            System.out.printf("%d ", whitelist[i]);
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            int a = rank(key, whitelist);
            if (a >= 0)
                StdOut.printf("%d %d", a, count(whitelist, a));
        }
    }
}