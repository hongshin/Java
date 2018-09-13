public class StringRelation
{
	public static void main(String [] args)
	{
		int c ;
		c = args[0].compareTo(args[1]) ;
		if (c == 0) 
			System.out.println(args[0] + " = " + args[1]) ;
		else 
			if (c < 0) 
				System.out.println(args[0] + " < " + args[1]) ;
			else 
				System.out.println(args[0] + " > " + args[1]) ;

		String s1 = "Hello world" ;
		System.out.println(s1.startsWith("Hello")) ;
		System.out.println(s1.endsWith("world")) ;
		System.out.println(s1.indexOf("Hi")) ;
		System.out.println(s1.indexOf("orl")) ;
	}
}
