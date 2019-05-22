
public class Ex01 {
	
    private  double x = 0.0;
    private  double y = 0.0;

    /**
     * Initializes a two-dimensional interval.
     * @param x the one-dimensional interval of x-coordinates
     * @param y the one-dimensional interval of y-coordinates
     */
    public Ex01(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public double disTo(Ex01 p)
    {
    	double d1, d2 = 0.0;
    	d1 = (p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y);
    	d2 = java.lang.Math.sqrt(d1);
//    	StdOut.println(d2);
    	return d2;
    }

    /**
     * Draws this two-dimensional interval to standard draw.
     */
    public void draw() 
    {
    	StdDraw.setPenRadius(.01);
        StdDraw.point(x, y);
    }

	public static void main(String[] args) 
	{
		int N = Integer.parseInt(args[0]);
		double d1 = 1.0;
		double d2 = 0.0;
		int r1 = 0;
		int r2 = 0;
		Ex01[] pv = new Ex01[N];
		for (int t = 0; t < N; t++)
		{
			double x = Math.random();
			double y = Math.random();
			Ex01 p = new Ex01(x, y);
			pv[t] = p;
			p.draw();
		}
		for (int i = 0; i != N; i++)
		{
			for (int j = i; j != N; j++)
			{
				d2 = pv[i].disTo(pv[j]);
				if (d2 < d1 && d2 != 0)
				{
					d1 = d2;
					r1 = i;
					r2 = j;
				}
			}
		}
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.line(pv[r1].x, pv[r1].y, pv[r2].x, pv[r2].y);
		StdOut.println(d1);

	}

}
