public class max {
    /** Returns the maximum value from m. */
    private static int max(int[] m) {
    int temp = m[0];
    for (int i = 0; i< m.length; i = i + 1) {
    if (m[i]> temp){
	temp = m[i];
     }
    }
   return temp;
   }

   public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
       int max_v = max(numbers);
       System.out.println(max_v);   
    }
}