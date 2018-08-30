import javax.swing.* ;
import java.awt.Graphics ;
import java.util.* ;
import java.io.* ;

class MyDrawing extends JPanel {
	public void paint(Graphics g) {
	}
}

public class Pointillism
{
	public static void main(String [] args)
	{
		try {
			Scanner s = new Scanner(new File("points.dat")) ;

			while (s.hasNextInt()) {
				int x = s.nextInt() ;
				int y = s.nextInt() ;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found") ;
		}


		JFrame f = new JFrame("Pointillism") ;

		f.getContentPane().add(new MyDrawing()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;

		f.setSize(600, 300) ;
		f.setVisible(true) ;
	}
}
