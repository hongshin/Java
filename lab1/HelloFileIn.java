import java.util.Scanner ;
import java.io.* ;

public class HelloFileIn
{
	public static void main(String [] args)
	{
		try {
			Scanner s = new Scanner(new File("names.txt")) ;

			while (s.hasNext()) {
				System.out.println("Hello, " + s.next()) ;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
		}
	}
}
