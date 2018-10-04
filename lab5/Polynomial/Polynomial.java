import java.util.* ;
import javax.swing.* ;
import java.awt.* ;


class MyDrawing extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY) ;
		for (double x = -20.0 ; x <= 20.0 ; x += 1.0) 
			g.drawLine((int) (x * 10.0 + 200.0), 0, (int)(x * 10.0 + 200.0), 400) ;
		for (double y = -20.0 ; y <= 20.0 ; y += 1.0)
			g.drawLine(0, (int)(200.0 - y * 10.0), 400, (int)(200.0 - y * 10.0)) ;

		g.setColor(Color.BLACK) ;
		g.drawLine(0, 200, 400, 200) ;
		g.drawLine(200, 0, 200, 400) ;
	
		g.setColor(Color.BLUE) ;

		double d = 0.1 ;
		for (double x = -20.0 ; x < 20.0 ; x += d) {
			//double y 	= x * x - x - 2.0 ;
			//double y_n 	= (x + 0.1) * (x + 0.1) - (x + 0.1) - 2.0 ;
			double y = Polynomial.formula.eval(x) ;
			double y_n = Polynomial.formula.eval(x + d) ;

			int p 	= (int)((x + 20.0) * 10.0) ;
			int p_n = (int)((x + d + 20.0) * 10.0) ;
			int q 	= (int)((20.0 - y) * 10.0) ;
			int q_n = (int)((20.0 - y_n) * 10.0) ;

			g.drawLine(p, q, p_n, q_n) ;
		}
	}
}

public class Polynomial
{
	public static Expression formula ;

	public static void main(String [] args) 
	{
		if (args.length != 1) {
			System.out.println("Illegal number of arguments") ;
			System.exit(1) ;
		}
	
		formula = new Expression(args[0]) ;

		JFrame frame = new JFrame("Polynomial") ;
		frame.getContentPane().add(new MyDrawing()) ;
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 400) ;
		frame.setVisible(true) ;
	}
}
