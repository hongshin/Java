import java.util.StringTokenizer ;

public class ListTest
{
	public static void main(String [] args)
	{
		List s1 = new LinkedList() ;
		List s2 = new ArrayList() ;
	
		StringTokenizer stk = new StringTokenizer("Construct various lists such as a linked list, a doubly linked list, an array list, a list with a binary tree and then use them in various purposes", " ,") ;

		while (stk.hasMoreTokens()) { 
			String token = stk.nextToken() ;
			s1.add(token) ;
			s2.add(token) ;
		}

		s1.removeFirst("binary") ;
		s1.removeFirst("list") ;

		s2.removeFirst("binary") ;
		s2.removeFirst("list") ;

		System.out.println(s1) ;
		System.out.println(s2) ;
	}
}
