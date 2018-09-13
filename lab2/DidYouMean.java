import java.util.Scanner ;
import java.io.* ;

public class DidYouMean
{
	public static void main(String [] args)
	{
		if (args.length != 1) {
			System.out.println("Wrong number of arguments") ;
			return ;
		}

		try {
			Scanner s = new Scanner(new File("wordset.txt")) ;

			// TO-DO

			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
		}
	}
}
