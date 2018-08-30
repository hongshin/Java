import javax.swing.* ;
import java.awt.Graphics ;


class MyDrawing extends JPanel {
	public void paint(Graphics g) {
		g.drawString("Hello, World", 100, 100) ;
	}
}

public class HelloGUI
{
	public static void main(String [] args)
	{
		JFrame f = new JFrame("Hello World") ;

		f.getContentPane().add(new MyDrawing()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize(400, 500) ;
		f.setVisible(true) ;
	}
}
