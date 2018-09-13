public class StringOp
{
	public static void main(String [] args)
	{
		String s = new String() ;
		for (int i = 0 ; i < args.length ; i++) {
			for (int j = 0 ; j < args[i].length() ; j++) {
				char c = args[i].charAt(j) ;
				s = s + c ;
			}
		}
		System.out.println(s) ;

		int index = s.indexOf('f') ;
		System.out.println("The first occurance of f is at " + index) ;
		System.out.println("The last occurance of l is at " + s.lastIndexOf('l')) ;

		String e = new String() ;
		System.out.println("empty() is " + e.isEmpty()) ;

		String lowered = s.toLowerCase() ;
		System.out.println(lowered) ;

		String prefix = s.substring(5) ;
		System.out.println(prefix) ;

		String piece = s.substring(1,5) ;
		System.out.println(piece) ;
	}
}
