public class UniqueListTest 
{
	public static void main(String [] args) 
	{
		UniqueList l = new UniqueList() ;
		Point p1 = new Point(1,1) ;
		Point p2 = new Point(1,2) ;

		l.add(p1) ;
		l.add(p2) ;

		System.out.println(l) ;
	}
}
