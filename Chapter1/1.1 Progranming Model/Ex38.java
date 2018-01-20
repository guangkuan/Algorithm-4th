import java.util.Arrays;
public class Ex38
{
    public static int rank(int key, int[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
               return i;
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}