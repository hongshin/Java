import java.awt.* ;

public class Square 
{
	Point p1, p2, p3, p4 ;
	Point c ;
	String label ;

	Square(Point ref, int side, String label) 
	{
		this.p1 = ref ;
		this.p2 = new Point(p1.x, p1.y + side) ;
		this.p3 = new Point(p1.x + side, p1.y + side) ;
		this.p4 = new Point(p1.x + side, p1.y) ;

		c = new Point(p1.x + side / 2, p1.y + side / 2) ;
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawLine(p1.x, p1.y, p2.x, p2.y) ;
		g.drawLine(p2.x, p2.y, p3.x, p3.y) ;
		g.drawLine(p3.x, p3.y, p4.x, p4.y) ;
		g.drawLine(p4.x, p4.y, p1.x, p1.y) ;
		g.drawString(label, c.x, c.y) ;
	}

	public void rotate(double a)
	{
		Point p1, p2, p3, p4 ;
		
		p1 = this.p1.rotate(c, a) ;
		p2 = this.p2.rotate(c, a) ;
		p3 = this.p3.rotate(c, a) ;
		p4 = this.p4.rotate(c, a) ;

		if (p1 != null && p2 != null && p3 != null && p4 != null) {
			this.p1 = p1 ;
			this.p2 = p2 ;
			this.p3 = p3 ;
			this.p4 = p4 ;
		}
	}

	public void move(int dx, int dy) 
	{
		Point p1, p2, p3, p4 ;

		p1 = this.p1.move(dx, dy) ;
		p2 = this.p2.move(dx, dy) ;
		p3 = this.p3.move(dx, dy) ;
		p4 = this.p4.move(dx, dy) ;

		if (p1 != null && p2 != null && p3 != null && p4 != null) {
			this.p1 = p1 ;
			this.p2 = p2 ;
			this.p3 = p3 ;
			this.p4 = p4 ;
			this.c = this.c.move(dx, dy) ;
		}
	}
}
