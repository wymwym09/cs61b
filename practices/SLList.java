public class SLList{
	public IntNode sentinel;
	public int size = 1;

	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}
	
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next =  new IntNode(x, null);
		size = 1;
	}
	
	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size +=1;
	}
	
	
	public void addLast(int x) {

		size +=1;

		IntNode p = sentinel;
		while (p.next != null)
		{

		   p = p.next;
		   
		}
		
		p.next = new IntNode(x,null);
		
	} 

	public int size() {
		/*int n = 1;
		IntNode p = first;
		while (p.next != null)
		{
			n +=1;
			p = p.next;
		}
		return n;*/
		return size;
	}

	public int getFirst() {
 		return sentinel.next.item;
 	}

	public static void main (String[] args) {
		SLList L = new SLList();
		//L.addFirst(10);
		L.addLast(8);
		System.out.println(L.size());
	
	}
}