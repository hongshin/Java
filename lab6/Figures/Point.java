import java.awt.* ;

public class Point 
{
	public int x ;
	public int y ;

	Point(int x, int y)
	{
		this.x = x ;
		this.y = y ;
	}

	public void draw(Graphics g)
	{
		g.drawLine(this.x, this.y, this.x, this.y) ;
	}

	Point rotate(Point c, double a)
	{
		int x, y ;
		double r = a / 360.0 * (Math.PI * 2.0) ;

		x = c.x + (int)((this.x - c.x) * Math.cos(-1.0 * r)) 
			- (int)((c.y - this.y) * Math.sin(-1.0 * r)) ;
		y = c.y - (int)((this.x - c.x) * Math.sin(-1.0 * r)) 
			- (int)((c.y - this.y) * Math.cos(-1.0 * r)) ;
	
		if (x < 0 || y < 0)
			return null ;
		return new Point(x, y) ;
	}

	Point move(int dx, int dy)
	{
		int x = this.x + dx ;
		int y = this.y + dy ;

		if (x < 0 || y < 0)
			return null ;
		return new Point(x, y) ;
	}
}
