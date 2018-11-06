public class Point extends Object
{
	int x ; 
	int y ;

	public Point(int x, int y) {
		this.x = x; 
		this.y = y; 
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false ;
		if (!(obj instanceof Point))
			return false ;
		
		Point that = (Point) obj ;
		return this.x == that.x && this.y == that.y ;
	}

	public String toString() 
	{
		return "(" + this.x + "," + this.y + ")" ;
	}
}
