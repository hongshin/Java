import java.awt.* ;

public class Triangle extends Figure
{
	Triangle(Point p1, Point p2, Point p3, String label) 
	{
		vertexes = new Point[3] ;
		vertexes[0] = p1 ;
		vertexes[1] = p2 ;
		vertexes[2] = p3 ;

		centroid = new Point((p1.x + p2.x + p3.x) / 3, (p1.y + p2.y + p3.y) / 3) ;
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawLine(vertexes[0].x, vertexes[0].y, vertexes[1].x, vertexes[1].y) ;
		g.drawLine(vertexes[1].x, vertexes[1].y, vertexes[2].x, vertexes[2].y) ;
		g.drawLine(vertexes[2].x, vertexes[2].y, vertexes[0].x, vertexes[0].y) ;
		g.drawString(label, centroid.x, centroid.y) ;
	}
}
