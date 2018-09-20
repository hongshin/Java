import java.util.* ;
import javax.swing.* ;
import java.awt.Graphics ;

class GomokuBoard extends JPanel {
	public void paint(Graphics g) {
		// Implement Here
	}
}

public class Gomoku
{
	public static int [] board = new int[81] ;
	public static String message = "" ;

	public static void main(String [] args)
	{
		JFrame f = new JFrame("Gomoku") ;

		f.getContentPane().add(new GomokuBoard()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize(500, 700) ;
		f.setVisible(true) ;

		Scanner s = new Scanner(System.in) ;

		// Implement Here
	}
}
