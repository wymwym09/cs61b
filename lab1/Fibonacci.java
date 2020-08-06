public class Fibonacci {


 private static int fibonacci(int n) {

    if(n == 0) {
    return 0;
    } else if (n == 1) {
         return 1;
      }
      else
      {
       return fibonacci(n-1) + fibonacci(n-2);
      }
  

    }


 public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter an int");
            System.out.println("e.g. java Fibonacci 4");
        }
        for (int i = 0; i < args.length; i++) {
            
                int n = Integer.parseInt(args[i]);
                int output = fibonacci(n);
		System.out.println(output);
            }
        }

}
