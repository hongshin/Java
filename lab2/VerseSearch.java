import java.util.Scanner ;
import java.io.* ;

public class VerseSearch
{
	public static void main(String [] args)
	{
		if (args.length == 0) {
			System.out.println("Wrong number of arguments.") ;
			return ;
		}

		try {
			Scanner s = new Scanner(new File("NIV.txt")) ;

			//TODO

		}
		catch (FileNotFoundException e) {
			System.out.println("File not found") ;
			return ;
		}
	}
}
