public class LinkedListTest
{
	public static void main(String [] ars) 
	{
		LinkedList l = new LinkedList() ;
		int i ;
		for (i = 0 ; i < 3 ; i++)
			l.add(new Integer(i)) ;
		for (i = 0 ; i < 3 ; i++)
			l.add(new Integer(i)) ;
		System.out.println(l) ;
	}
}
