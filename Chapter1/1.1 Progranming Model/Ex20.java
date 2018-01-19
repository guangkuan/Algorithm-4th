 public class Ex20 
 {
     public static double ln(int N) 
     {
         if (N == 0) 
         {
             return 0;
         } 
         else 
         {
             return Math.log(N) + ln(N - 1);
         }
     }
 
     public static void main(String[] args) 
     {
         int N = StdIn.readInt();
         System.out.println(ln(N));
     }
}