public class Ex35
{
    private static int SIDES = 6;
    
    public static double[] getExact()
    {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;
        
        return dist;
    }
    
    public static int throwDice()
    {
        return StdRandom.uniform(1, SIDES + 1) + StdRandom.uniform(1, SIDES + 1);
    }
    
    public static double[] getExperim(int N)
    {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 0; i < N; i++)
            dist[throwDice()] += 1;
        
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= N;
        
        return dist;
    }

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double[] exact = getExact();
        for (int i = 2; i <= 2 * SIDES; i++)
            System.out.printf("%6d", i);
        System.out.println();
        
        for (int i = 2; i <= 2 * SIDES; i++)
            System.out.printf("%6.3f", exact[i]);
        System.out.println();
        
        double[] experim = getExperim(N); 
        for (int i = 2; i <= 2 * SIDES; i++)
            StdOut.printf("%6.3f", experim[i]);
        System.out.println();
        
        // Empirical results match exact ones to 3 decimal places when
        // N >= 7,500,000  (< 1 sec.)
    }
}