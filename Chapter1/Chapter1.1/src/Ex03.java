public class Ex03
{
    public static void main(String[] args)
    {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a == b && b == c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}