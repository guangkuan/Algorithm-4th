public class Ex18
{
    public static int mystery(int a, int b)
    {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
    
    public static int mystery1(int a, int b)
    {
        if (b == 0)
        {
            return 1;
        }
        if (b % 2 == 0)
        {
            return mystery1(a * a, b / 2);
        }
        else
            return mystery1(a * a, b / 2) * a;
    }
    
    public static void main(String[] args)
    {
        int m1 = mystery(2, 25);
        int m2 = mystery(3, 11);
        int m3 = mystery1(2, 4);
        int m4 = mystery1(3, 5);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
        
