import java.awt.* ;

public class Circle
{
	Point c ;
	int radius ;
	String label ;

	Circle(Point c, int radius, String label) 
	{
		this.c = c ;
		this.radius = radius ; 
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawOval(c.x - radius, c.y - radius, radius * 2, radius * 2) ;
		g.drawString(label, c.x, c.y) ;
	}

	public void rotate(double a)
	{
	}

	public void move(int dx, int dy) 
	{
		c = this.c.move(dx, dy) ;
		if (c != null) {
			this.c = c ;
		}
	}
}
