import java.util.* ;

public class StrTok
{
	public static void main(String [] args)
	{
		for (int i = 0 ; i < args.length ; i++) 
			for (StringTokenizer st = new StringTokenizer(args[i]) ; st.hasMoreTokens() ; )
				System.out.println(st.nextToken()) ;

		for (int i = 0 ; i < args.length ; i++) 
			for (StringTokenizer st = new StringTokenizer(args[i], ".,:;()\t") ; st.hasMoreTokens() ; )
				System.out.println(st.nextToken()) ;
	
	}
}
