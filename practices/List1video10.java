public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r){
		first  = f;
		rest =  r;
	}

	public int get(int i) {

		if (i == 0) {
			return this.first;
		}

		else
		{
			return this.rest.get(i-1);
		}

	}
	public static void main(Strin[] args){
		IntList L = new IntList(15,null);
		L = new IntList(10,L);
		L = new IntList(5,L);
		System.out.println(L.get(1));
	}
}