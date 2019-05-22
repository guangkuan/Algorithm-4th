
public class Ex02 {

	double p1 = 0.0;
	double p2 = 0.0;
	
	public Ex02(double x, double y)
	{
		if (x <= y)
		{
			this.p1 = x;
			this.p2 = y;
		}
		else
		{
			this.p1 = y;
			this.p2 = x;
		}
	}
	
	public boolean intersect(Ex02 that)
	{
		if (this.p2 < that.p1 || this.p1 > that.p2)
			return false;
		else
			return true;
	}
	
	public boolean contain(Ex02 that)
	{
		StdOut.printf("ec2(%f, %f), (%f, %f)\n", this.p1, this.p2, that.p1, that.p2);
		if ((this.p1 < that.p1) && (this.p2 > that.p2))
		{
			StdOut.printf("coordinate(%f, %f), (%f, %f)\n", this.p1, this.p2, that.p1, that.p2);
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		Ex02[] ve2 = new Ex02[N];
		Double[] ad = new Double[2 * N];
		int i = 0;
		
		while (!StdIn.isEmpty() && i != 2 * N)
		{
			String si = StdIn.readString();
//			StdOut.printf("%s %d-------------->\n", si, i);
			ad[i] = Double.parseDouble(si);
			i++;
		}
		
		for (int l = 0; l != 2 * N; l++)
		{
			Double pp1 = ad[l];
			l++;
			Double pp2 = ad[l];
			ve2[l / 2] = new Ex02(pp1, pp2);
		}
		for (int j = 0; j != N; j++)
		{
			for (int k = j + 1; k != N; k++)
			{
				if (ve2[j].intersect(ve2[k]))
				{
					StdOut.printf("(%f, %f), (%f, %f) intersected...\n", ve2[j].p1, ve2[j].p2, ve2[k].p1, ve2[k].p2);
				}
			}
		}

	}

}
