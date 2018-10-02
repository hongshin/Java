import java.io.* ;
import java.net.* ;

public class TagStrip
{
	public static void main(String [] args) 
	{
		BufferedInputStream in ;

		if (args.length != 1) {
			System.err.println("Illegal argument") ;
			System.exit(1) ;
		}

		try {
			URL u = new URL(args[0]) ;
			in = new BufferedInputStream(u.openStream()) ;
			
			int tagLevel = 0 ;
			String s = new String() ;
			for (int r = in.read() ; r != -1 ; r = in.read()) {
				char c = (char) r ;

				if (tagLevel == 0) {
					if (c == '<') {
						tagLevel++ ;
					}
					else if (c == '\n') {
						s = s.trim() ;
						if (s.equals("") == false) { 
							System.out.println(s) ;
							s = new String() ;
						}
					}
					else {
						s = s + c ;
					}
				}
				else /* tagLevel > 0 */ {
					if (c == '>')
						tagLevel-- ;
				}

			}
		}
		catch (IOException ioe) {
			System.err.println("Fail to open the given URL") ;
			System.exit(1) ;
		}
	}
}
