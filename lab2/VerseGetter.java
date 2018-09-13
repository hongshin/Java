import java.util.Scanner ;
import java.io.* ;

public class VerseGetter
{
	public static void main(String [] args)
	{
		if (args.length != 3) {
			System.out.println("Wrong number of arguments.") ;
			return ;
		}

		try {
			Scanner s = new Scanner(new File("NIV.txt")) ;

			String prefix = args[0] + " " + args[1] + ":" + args[2] ;

			while (s.hasNext()) {
				String l = s.nextLine() ;
				if (l.startsWith(prefix)) {
					System.out.println(l.substring(prefix.length()) + 1) ;
					break ;
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
			return ;
		}
	}
}
