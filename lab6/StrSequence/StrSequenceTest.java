import java.util.StringTokenizer ;

public class StrSequenceTest
{
	public static void main(String [] args)
	{
		StrSequence s = new StrSequence() ;
	
		StringTokenizer stk = new StringTokenizer("Construct various lists such as a linked list, a doubly linked list, an array list, a list with a binary tree and then use them in various purposes", " ,") ;

		while (stk.hasMoreTokens()) 
			s.add(stk.nextToken()) ;

		System.out.println(s.concat(" ")) ;

		s.removeFirst("binary") ;
		s.removeFirst("list") ;

		System.out.println(s.concat("_")) ;
	}
	
}
