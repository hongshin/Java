import javax.swing.* ;
import java.awt.Graphics ;
import java.util.Scanner ;

class MyDrawing extends JPanel {
	public void paint(Graphics g) {
		g.drawString("(0  , 120]", 10, 20) ;
		g.drawString("(120, 130]", 10, 40) ;
		g.drawString("(130, 140]", 10, 60) ;
		g.drawString("(140, 150]", 10, 80) ;
		g.drawString("(150, 160]", 10, 100) ;
		g.drawString("(160, 170]", 10, 120) ;
		g.drawString("(170, 180]", 10, 140) ;
		g.drawString("(180, 200)", 10, 160) ;

		Scanner s = new Scanner(System.in) ;
		int i = 0 ;
		int [] count = new int[8] ;
		for (i = 0 ; i < 8 ; i++) 
			count[i] = 0 ;

		g.drawRect(80, 5, 50, 18) ;
		g.drawRect(80, 25, 50, 18) ;
		g.drawRect(80, 45, 50, 18) ;
		g.drawRect(80, 65, 50, 18) ;
		g.drawRect(80, 85, 50, 18) ;
		g.drawRect(80, 105, 50, 18) ;
		g.drawRect(80, 125, 50, 18) ;
		g.drawRect(80, 145, 50, 18) ;
	}
}

public class Histogram
{
	public static void main(String [] args)
	{
		JFrame f = new JFrame("Histogram") ;

		f.getContentPane().add(new MyDrawing()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize(600, 200) ;
		f.setVisible(true) ;
	}
}
