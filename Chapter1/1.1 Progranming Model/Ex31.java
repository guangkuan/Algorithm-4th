public class Ex31
{
    public static void drawRandConn(int N, double p)
    {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setScale(-1.0, 1.0);
        StdDraw.circle(0, 0, 1);
        
        StdDraw.setPenRadius(0.05); 
        double[][] d = new double[N][2];
        for (int i = 0; i < N; i++)
        {
            d[i][0] = Math.cos(2 * Math.PI * i / N);
            d[i][1] = Math.sin(2 * Math.PI * i / N);
            StdDraw.point(d[i][0], d[i][1]);
        }
        
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.GRAY);
        for (int i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++)
                if (StdRandom.bernoulli(p))
                    StdDraw.line(d[i][0], d[i][1], d[j][0], d[j][1]);
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        drawRandConn(N, p);
    }
}