public class Ex14
{
    public static void lg(int N)
    {
        int sum = -1;
        for (int n = N; n > 0; n /= 2)
            sum += 1;
        System.out.println(sum);
    }
    
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        lg(N);
    }
}