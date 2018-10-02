import java.io.* ;
import java.net.* ;

public class GetWeather
{
	public static void main(String [] args) 
	{
		BufferedInputStream in ;

		try 
		{
			URL u = new URL("https://web.kma.go.kr/eng/weather/forecast/current_korea.jsp") ;
			in = new BufferedInputStream(u.openStream()) ;

			String line = new String() ;
			for (int r = in.read() ; r != -1 ; r = in.read()) {
				char c = (char) r ;
				
				if (c == '\n') {
					System.out.println(line) ;
					line = new String() ;
				}
				else {
					line = line + c ;
				}
			}
		}
		catch (IOException ioe) {
			System.err.println("Fail to open the given URL") ;
			System.exit(1) ;
		}
	}
}
