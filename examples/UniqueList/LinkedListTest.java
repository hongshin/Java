public class LinkedListTest
{
	public static void main(String [] args) {
		LinkedList l = new LinkedList(new Point(0,0)) ;
		System.out.println(l.add(new Point(1,1))) ;
		System.out.println(l.add(new Integer(1))) ;
	}
}
