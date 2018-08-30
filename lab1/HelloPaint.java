import javax.swing.* ;
import java.awt.Graphics ;


class MyDrawing extends JPanel {
	public void paint(Graphics g) {
		g.drawRect(100, 100, 20, 100) ;
		g.drawRect(140, 100, 20, 100) ;
		g.drawRect(100, 140, 60, 20) ;

		g.drawRect(180, 100, 20, 20) ;
		g.drawRect(180, 130, 20, 70) ;

		g.drawRect(210, 200, 0, 0) ;
	}
}

public class HelloPaint
{
	public static void main(String [] args)
	{
		JFrame f = new JFrame("Hello World") ;

		f.getContentPane().add(new MyDrawing()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize(400, 300) ;
		f.setVisible(true) ;
	}
}
