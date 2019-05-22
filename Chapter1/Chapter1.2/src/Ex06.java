
public class Ex06 {

	public static boolean ifRotation(String s, String t)
	{
		if (s.length() != t.length())
			return false;
		
		for (int i = 0; i != s.length(); i++)
		{
			if (s.compareTo(t) == 0)
				return true;
			else
			{
				s = s.substring(1) + s.charAt(0);
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String t = "llohe";
		if (ifRotation(s, t) == true)
			StdOut.printf("yes");
		else
			StdOut.printf("no");

	}

}
