import java.awt.* ;

public class Square extends Figure
{
	Square(Point ref, int side, String label) 
	{
		vertexes = new Point[4] ;
		vertexes[0] = ref ;
		vertexes[1] = new Point(ref.x, ref.y + side) ;
		vertexes[2] = new Point(ref.x + side, ref.y + side) ;
		vertexes[3] = new Point(ref.x + side, ref.y) ;

		centroid = new Point(ref.x + side / 2, ref.y + side / 2) ;
		this.label = label ;
	}

	public void draw(Graphics g)
	{
		g.drawLine(vertexes[0].x, vertexes[0].y, vertexes[1].x, vertexes[1].y) ;
		g.drawLine(vertexes[1].x, vertexes[1].y, vertexes[2].x, vertexes[2].y) ;
		g.drawLine(vertexes[2].x, vertexes[2].y, vertexes[3].x, vertexes[3].y) ;
		g.drawLine(vertexes[3].x, vertexes[3].y, vertexes[0].x, vertexes[0].y) ;
		g.drawString(label, centroid.x, centroid.y) ;
	}
}
