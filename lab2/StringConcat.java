public class StringConcat
{
	public static void main(String [] args)
	{
		String s = new String() ;
		int i ;
		for (i = 0 ; i < args.length ; i++) {
			System.out.println(args[i] + " " + args[i].length()) ;
			if (i == 0)
				s = new String(args[i]) ;
			else 
				s = s + " " + args[i] ;
		}
		System.out.println(s + " " + s.length()) ;
	}
}
