public class Ex21
{
    public static void main(String[] args) 
    {
        int n = StdIn.readInt();
        String[] nameArray = new String[n];
        int[] integerArray1 = new int[n];
        int[] integerArray2 = new int[n];
        for (int i = 0; i < n; i++) 
        {
            nameArray[i] = StdIn.readString();
            integerArray1[i] = StdIn.readInt();
            integerArray2[i] = StdIn.readInt();
        }
        
        for (int i = 0; i < n; i++) 
        {
            System.out.printf("%10s %2d %2d %5.3f\n", nameArray[i], integerArray1[i], integerArray2[i], (float) integerArray1[i] / integerArray2[i]);
        }
        System.out.println();
    }
}