import java.util.List;  
import java.util.ArrayList; 
import java.util.Arrays;
public class Ex28
{
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length - 1; i++) 
        {
            if (whitelist[i] != whitelist[i + 1]) 
                list.add(whitelist[i]);
        }
        
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
    }
}