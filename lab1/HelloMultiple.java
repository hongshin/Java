import java.util.Scanner ;
import java.io.* ;

public class HelloMultiple
{
	public static void main(String [] args)
	{
		try {
			Scanner s = new Scanner(new File("names_num.txt")) ;

			while (s.hasNext()) {
				String a = s.next() ;
				int n = s.nextInt() ;
				int i ;

				for (i = 0 ; i < n ; i++) 
					System.out.println("Hello, " + a) ;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
		}
	}
}
