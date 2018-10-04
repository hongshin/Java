import java.util.* ;
import javax.swing.* ;
import java.awt.* ;

class SimpleMainDrawing extends JPanel 
{
	public void paint(Graphics g) 
	{
		SimpleMain.t1.draw(g) ;
		SimpleMain.s1.draw(g) ;
		SimpleMain.r1.draw(g) ;
	}
}

public class SimpleMain
{
	public static Triangle t1 ;
	public static Square s1 ;
	public static Circle r1 ;

	public static void main(String [] args) 
	{
		Point p1 = new Point(200, 150) ;
		Point p2 = new Point(150, 200) ;
		Point p3 = new Point(250, 200) ;

		t1 = new Triangle(p1, p2, p3, "A") ;
		s1 = new Square(new Point(100, 100), 30, "B") ;
		r1 = new Circle(new Point(300, 300), 15, "C") ;

		t1.rotate(45) ;

		JFrame frame = new JFrame("Figures") ;
		frame.getContentPane().add(new SimpleMainDrawing()) ;
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 400) ;
		frame.setVisible(true) ;
	}
}
