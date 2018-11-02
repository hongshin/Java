import java.util.* ;
import javax.swing.* ;
import java.awt.* ;

class MyDrawing extends JPanel 
{
	public void paint(Graphics g) 
	{
		for (int i = 0 ; i < Main.figures.length ; i++) 
			Main.figures[i].draw(g) ;
	}
}

public class Main
{
	public static Figure [] figures = new Figure[4] ;

	public static void main(String [] args) 
	{
		Point p1 = new Point(200, 150) ;
		Point p2 = new Point(150, 200) ;
		Point p3 = new Point(250, 200) ;
		Point p4 = new Point(100, 100) ;
		Point p5 = new Point(300, 300) ;


		figures[0] = new Triangle(p1, p2, p3, "A") ;
		figures[1] = new Square(p4, 30, "B") ;
		figures[2] = new Circle(p5, 15, "C") ;
		figures[3] = new Circle(p1, 20, "D") ;

		Scanner in = new Scanner(System.in) ;
		JFrame frame = new JFrame("Figures") ;
		frame.getContentPane().add(new MyDrawing()) ;
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 400) ;
		frame.setVisible(true) ;
		
		while (true) {
			String action = in.next() ;
			String target = in.next() ;
			String value = in.next() ;

			switch (action) {
				case "movx": {
					for (int i = 0 ; i < figures.length ; i++) {
						if (target.equals(figures[i].getLabel())) {
							figures[i].move(Integer.parseInt(value), 0) ;
							break ;
						}
					}
					break ;
				}

				case "movy": {
					for (int i = 0 ; i < figures.length ; i++) {
						if (target.equals(figures[i].getLabel())) {
							figures[i].move(0, Integer.parseInt(value)) ;
							break ;
						}
					}
					break ;
				}

				case "rotate": {
					for (int i = 0 ; i < figures.length ; i++) {
						if (target.equals(figures[i].getLabel())) {
							figures[i].rotate(Double.parseDouble(value)) ;
							break ;
						}
					}
					break ;
				}
			}

			frame.repaint(0, 0, 0, 400, 400) ;
		} 
	}
}
