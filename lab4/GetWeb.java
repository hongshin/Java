import java.io.* ;
import java.net.* ;

public class GetWeb
{
	public static void main(String [] args) 
	{
		BufferedInputStream in ;

		if (args.length != 1) {
			System.err.println("Illegal number of arguments") ;
			System.exit(1) ;
		}


		try 
		{
			URL u = new URL(args[0]) ;
			in = new BufferedInputStream(u.openStream()) ;

			for (int r = in.read() ; r != -1 ; r = in.read()) {
				char c = (char) r ;
				System.out.print(c) ;
			}
			in.close() ;
		}
		catch (IOException ioe) {
			System.err.println("Fail to open the given URL") ;
			System.exit(1) ;
		}
	}
}
