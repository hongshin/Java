import java.awt.* ;

public class Circle extends Figure
{
	int radius ;

	Circle(Point c, int radius, String label) 
	{
		this.centroid = c ;
		this.radius = radius ; 
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawOval(centroid.x - radius, centroid.y - radius, radius * 2, radius * 2) ;
		g.drawString(label, centroid.x, centroid.y) ;
	}
}
