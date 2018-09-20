import java.util.Scanner ;
import java.io.* ;

public class FilePrint
{
	public static void main(String [] args)
	{
		boolean printLineNum = false ;
		boolean printFileName = false ;
		int begin = 1 ;
		String indent = "" ;
		String fileName = args[args.length - 1] ;

		for (int i = 0 ; i < args.length - 1 ; i++) {
			if (args[i].charAt(0) == '-' && args[i].length() == 2) {
				switch (args[i].charAt(1)) {
					case 'n':
					case 'l': {
						printLineNum = true ;
						break ;
					}

					case 'b': {
						i += 1 ;
						begin = Integer.parseInt(args[i]) ;
						break ;
					}

					case 'i': {
						i += 1 ;
						for (int j = 0 ; j < Integer.parseInt(args[i]) ; j++) 
							indent = indent + " " ;
						break ;
					}

					case 'f': {
						printFileName = true ;
						break ;
					}
				}
			}
		}

		try {
			Scanner s = new Scanner(new File(fileName)) ;
			for (int n = 1 ; s.hasNext() ; n++) {
				String l = s.nextLine() ;

				if (n < begin)
					continue ;
			
				if (printFileName)
					System.out.print(fileName + ":") ;
				if (printLineNum)
					System.out.print(n + ":") ;
				System.out.println(indent + l) ;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
		}
	}
}
