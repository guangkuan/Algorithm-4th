public class Ex15
{
    public static int[] histogram(int[] a, int M) 
    {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] >= 0 && a[i] < M) 
            {
                result[a[i]]++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int[] a = { 0, 0, 2, 3, 4, 2, 3, 5, 6, 2, 3, 6, 3, 5, 7, 2, 4, 0, 2, 5, 9 };
        int[] b = { 0, 0, 2, 15, 23, 2, 55, 0, 2, 5, 9 };
        
        int[] result = histogram(a, 10);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.printf("%3d", result[i]);
        }
        System.out.println();
        
        int[] result1 = histogram(b, 10);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.printf("%3d", result1[i]);
        }
    }
}