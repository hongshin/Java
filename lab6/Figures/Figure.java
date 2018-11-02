import java.awt.* ;

public class Figure
{
	protected Point centroid ;
	protected Point [] vertexes ;
	protected String label ;

	public String getLabel()
	{
		return label ;
	}

	public void draw(Graphics g) 
	{
		g.drawString(label, centroid.x, centroid.y) ;
	}

	public void rotate(double a)
	{
		for (int i = 0 ; i < vertexes.length ; i++) {
			vertexes[i] = vertexes[i].rotate(centroid, a) ;
		}
	}

	public void move(int dx, int dy)
	{
		for (int i = 0 ; i < vertexes.length ; i++) {
			vertexes[i] = vertexes[i].move(dx, dy) ;
		}
		centroid = centroid.move(dx, dy) ;
	}
}
