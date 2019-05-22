

public class Ex03 {
	private Ex02 i1;
	private Ex02 i2;
	public Ex03(Ex02 i1, Ex02 i2)
	{
		this.i1 = i1;
		this.i2 = i2;
	}
	
	public boolean intersect(Ex03 that)
	{
		if (this.i1.intersect(that.i1) && this.i2.intersect(that.i2))
		{
			StdOut.printf("intersect (%f, %f), (%f, %f)\n", this.i1.p1, this.i2.p1, that.i1.p1, that.i2.p1);
			return true;
		}
		else
			return false;
	}
	
	public boolean contain(Ex03 that)
	{
		if ((this.i1.contain(that.i1) && this.i2.contain(that.i2)) || (that.i1.contain(this.i1) && that.i2.contain(this.i2)))
		{
			StdOut.printf("contain(%f, %f), (%f, %f)\n", this.i1.p1, this.i2.p1, that.i1.p1, that.i2.p1);
			return true;
		}
		else
			return false;
	}
	
	public void draw()
	{
		double c1 = i1.p1 + (i1.p2 - i1.p1) / 2;
		double c2 = i2.p1 + (i2.p2 - i2.p1) / 2;
		double width = (i1.p2 - i1.p1) / 2;
		double height = (i2.p2 - i2.p1) / 2;
		StdDraw.rectangle(c1, c2, width, height);
//		StdOut.printf("(%f, %f), width = %f, heigth = %f\n", c1, c2, width, height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		Double min = Double.parseDouble(args[1]);
		Double max = Double.parseDouble(args[2]);
		Ex03[] ai2d = new Ex03[N];
		int r1 = 0;
		int r2 = 0;
		
		for (int i = 0; i != N; i++)
		{
			double s1 = StdRandom.uniform() * (max - min);
			double c1 = StdRandom.uniform() * (max - min - s1);
			double s2 = StdRandom.uniform() * (max - min);
			double c2 = StdRandom.uniform() * (max - min - s2);
			Ex02 i1 = new Ex02(min + c1, min + s1 + c1);
			Ex02 i2 = new Ex02(min + c2, min + s2 + c2);
			Ex03 i2d = new Ex03(i1, i2);
			ai2d[i] = i2d;
//			StdOut.printf("(%f, %f), (%f, %f)\n", i1.p1, i1.p2, i2.p1, i2.p2);
			i2d.draw();
		}
		
		for (int j = 0; j != N; j++)
		{
			for (int k = j + 1; k != N; k++)
			{
				if (ai2d[j].intersect(ai2d[k]))
				{
					r1++;
				}
				
				if (ai2d[j].contain(ai2d[k]))
				{
					r2++;
				}
			}
		}
		StdOut.printf("%d intersected, %d contained", r1, r2);

	}

}
