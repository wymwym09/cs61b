public class DrawTrangle {

 public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter an int");
            System.out.println("e.g. java DrawTrangle 4");
        }
        for (int i = 0; i < args.length; i++) {
            
                int n = Integer.parseInt(args[i]);
		int index_1 = 0;
                while(index_1 < n)
		{
                int index_2 = 0;
		while (index_2 <= index_1)
		{
		System.out.print("*");
		index_2 = index_2 + 1;
		}
		System.out.println();	
		index_1 = index_1 + 1;
                }
            }
        }

}
