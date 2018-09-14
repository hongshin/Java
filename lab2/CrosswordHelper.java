import java.util.Scanner ;
import java.io.* ;

public class CrosswordHelper
{
	public static void main(String [] args)
	{
		try {
			Scanner s = new Scanner(new File("wordset.txt")) ;

			String key = args[0].toLowerCase() ;

			while (s.hasNext()) {
				String w = s.next() ;
				w = w.toLowerCase() ;
				
				if (w.length() != key.length())
					continue ;

				boolean mismatch = false ;
				for (int i = 0 ; i < w.length() ; i++) {
					if (key.charAt(i) != '.' && key.charAt(i) != w.charAt(i)) {
						mismatch = true ;
						break ;
					}
				}
				if (mismatch == false) 
					System.out.println(w) ;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
		}
	}
}
