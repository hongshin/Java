import java.util.NoSuchElementException ;
public class Test
{
	public static void main(String [] args) 
	{
		ArrayDictionary d = new ArrayDictionary(3) ;
		d.put("1", "Jan") ;
		d.put("2", "Feb") ;
		d.put("3", "Mar") ;
		d.put("4", "May") ;
		try {
			d.get(null) ;
			System.out.println("Fail") ;
			System.exit(1) ;
		}
		catch (IllegalArgumentException e) {
		}
		d.remove("4") ;
		try {
			d.remove("4") ;
			System.out.println("Fail") ;
			System.exit(1) ;
		}
		catch (NoSuchElementException e) {
		}
		d.put("4", "Apr") ;
		if (!d.get("3").equals("Mar")) {
			System.out.println("Fail") ;
			System.exit(1) ;
		}
		if (!d.get("4").equals("Apr")) {
			System.out.println("Fail") ;
			System.exit(1) ;
		}
		if (!d.get("2").equals("Feb")) {
			System.out.println("Fail") ;
			System.exit(1) ;
		}
		if (!d.get("1").equals("Jan")) {
			System.out.println("Fail") ;
			System.exit(1) ;
		}

		System.out.println("Pass") ;
	}
}
