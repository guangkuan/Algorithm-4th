public class Ex24 {
    public static int Euclid(int p, int q) 
    {
        System.out.printf("p = %7d, q = %7d\n", p, q);
        if (p == 0 || q == 0) 
        {
            return 1;
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
            return Euclid(q, p % q);
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("result: " + Euclid(105, 24));
        System.out.println("result: " + Euclid(1111111, 1234567));
    }
}