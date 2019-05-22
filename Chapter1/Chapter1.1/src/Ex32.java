public class Ex32
{
    public static void histogram(double[] values, int N, double l, double r)
    {
        int[] counts = new int[N];
        for (int i = 0; i < values.length; i++)
        {
            int k = getInterval(values[i], N, l, r);
            if (k >= 0)
                counts[k]++;
        }
        
        int maxCount = StdStats.max(counts);
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(l, r);
        StdDraw.setYscale(0, maxCount);
        double w = (r - l) / N;   
        for (int i = 0; i < N; i++)
        {
            double x = l + (i + 0.5) * w,
                   y = counts[i] / 2.0,
                   rw = 0.5 * w,
                   rh = counts[i] / 2.0;
            System.out.printf("%.2f %.2f\n", x, y);
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
    
    private static int getInterval(double v, int N, double l, double r)
    {
        if (v < l || v >= r)
            return -1;
        else
            return (int)((v - l) / ((r - l) / N));
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]), r = Double.parseDouble(args[2]);    
        double[] values = In.readDoubles();
        
        histogram(values, N, l, r);
    }
}