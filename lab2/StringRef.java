public class StringRef
{
	public static void main(String [] args) 
	{
		String s1 = "Hello world" ;
		String s2 = new String("Hello world") ;
		String s3 = new String("Hello world") ;

		System.out.println(s1) ;
		System.out.println(s2) ;
		System.out.println(s3) ;

		
		if (s1 == s2) 
			System.out.println("s1 and s2 have the same value") ;
		else 
			System.out.println("s1 and s2 do not have the same value") ;

		if (s2 == s3) 
			System.out.println("s2 and s3 have the same value") ;
		else 
			System.out.println("s2 and s3 do not have the same value") ;

		
		if (s1.equals(s2)) 
			System.out.println("s1 and s2 are identical") ;
		else 
			System.out.println("s1 and s2 are identical") ;

		if (s2.equals(s3)) 
			System.out.println("s2 and s3 are identical") ;
		else 
			System.out.println("s2 and s3 are identical") ;


	}
}
