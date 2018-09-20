import java.util.* ;
import javax.swing.* ;
import java.awt.Graphics ;


class MyDrawing extends JPanel {
	public void paint(Graphics g) {
		g.fillOval(BouncingBall.X, BouncingBall.Y, BouncingBall.Radius * 2, BouncingBall.Radius * 2) ;
	}
}

public class BouncingBall
{
	public static int Radius = 5 ;
	public static int X = 0, Y = 0 ;
	public static int dX = 0, dY = 0 ;

	public static void main(String [] args)
	{
		JFrame f = new JFrame("Bouncing Ball") ;

		f.getContentPane().add(new MyDrawing()) ;
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize(400, 500) ;
		f.setVisible(true) ;

		if (args.length < 2) 
			System.exit(1) ;

		BouncingBall.X = Integer.parseInt(args[0]) - BouncingBall.Radius ;
		BouncingBall.Y = Integer.parseInt(args[1]) - BouncingBall.Radius ;
		for (int i = 2 ; i < args.length ; i++) {
			if (args[i].equals("up"))
				BouncingBall.dY = -1 ;
			else if (args[i].equals("down"))
				BouncingBall.dY = 1 ;
			else if (args[i].equals("left"))
				BouncingBall.dX = -1 ;
			else if (args[i].equals("right")) 
				BouncingBall.dX = 1 ;
		}

		while (true) {
			BouncingBall.X += BouncingBall.dX ;
			BouncingBall.Y += BouncingBall.dY ;

			if (BouncingBall.X == 0 || BouncingBall.X == 400 - BouncingBall.Radius)
				BouncingBall.dX = BouncingBall.dX * -1 ;
			if (BouncingBall.Y == 0 || BouncingBall.Y == 500 - BouncingBall.Radius)
				BouncingBall.dY = BouncingBall.dY * -1 ;

			f.repaint(0, 0, 0, 400, 500) ;

			long start = System.currentTimeMillis() ;
			while (System.currentTimeMillis() - start < 10) ;

		}
	}
}
