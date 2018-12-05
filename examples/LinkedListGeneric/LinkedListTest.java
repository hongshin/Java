import java.util.StringTokenizer ;

public class LinkedListTest
{
	public static void main(String [] ars) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>() ;
		int i ;
		for (i = 0 ; i < 3 ; i++)
			l.add(new Integer(i)) ;
		for (i = 0 ; i < 3 ; i++)
			l.add(new Integer(i)) ;
		//l.add("Hello") ;
		//l.add(new Double(0.3)) ;
		//l.add(new StringTokenizer("Hello world")) ;
		System.out.println(l) ;
	}
}
