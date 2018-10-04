import java.awt.* ;

public class Triangle
{
	Point p1, p2, p3 ;
	Point c ;
	String label ;

	Triangle(Point p1, Point p2, Point p3, String label) 
	{
		this.p1 = p1 ;
		this.p2 = p2 ;
		this.p3 = p3 ;

		c = new Point((p1.x + p2.x + p3.x) / 3, (p1.y + p2.y + p3.y) / 3) ;
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawLine(p1.x, p1.y, p2.x, p2.y) ;
		g.drawLine(p2.x, p2.y, p3.x, p3.y) ;
		g.drawLine(p3.x, p3.y, p1.x, p1.y) ;
		g.drawString(label, c.x, c.y) ;
	}

	public void rotate(double a)
	{
		Point p1, p2, p3 ;
		
		p1 = this.p1.rotate(c, a) ;
		p2 = this.p2.rotate(c, a) ;
		p3 = this.p3.rotate(c, a) ;

		if (p1 != null && p2 != null && p3 != null) {
			this.p1 = p1 ;
			this.p2 = p2 ;
			this.p3 = p3 ;
		}
	}

	public void move(int dx, int dy) 
	{
		Point p1, p2, p3 ;

		p1 = this.p1.move(dx, dy) ;
		p2 = this.p2.move(dx, dy) ;
		p3 = this.p3.move(dx, dy) ;

		if (p1 != null && p2 != null && p3 != null) {
			this.p1 = p1 ;
			this.p2 = p2 ;
			this.p3 = p3 ;
			this.c = this.c.move(dx, dy) ;
		}
	}
}
