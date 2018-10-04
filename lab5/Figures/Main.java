import java.util.* ;
import javax.swing.* ;
import java.awt.* ;

class MyDrawing extends JPanel 
{
	public void paint(Graphics g) 
	{
		Main.t1.draw(g) ;
		Main.s1.draw(g) ;
		Main.r1.draw(g) ;
	}
}

public class Main
{
	public static Triangle t1 ;
	public static Square s1 ;
	public static Circle r1 ;

	public static void main(String [] args) 
	{
		Point p1 = new Point(200, 150) ;
		Point p2 = new Point(150, 200) ;
		Point p3 = new Point(250, 200) ;
		Point p4 = new Point(100, 100) ;
		Point p5 = new Point(300, 300) ;


		t1 = new Triangle(p1, p2, p3, "A") ;
		s1 = new Square(p4, 30, "B") ;
		r1 = new Circle(p5, 15, "C") ;

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
					switch (target) {
						case "A":
							t1.move(Integer.parseInt(value), 0) ;	
							break ;
						case "B":
							s1.move(Integer.parseInt(value), 0) ;
							break ;
						case "C":
							r1.move(Integer.parseInt(value), 0) ;
							break ;
					}
					break ;
				}

				case "movy": {
					switch (target) {
						case "A":
							t1.move(0, Integer.parseInt(value)) ;	
							break ;
						case "B":
							s1.move(0, Integer.parseInt(value)) ;
							break ;
						case "C":
							r1.move(0, Integer.parseInt(value)) ;
							break ;
					}
					break ;
				}

				case "rotate": {
					switch (target) {
						case "A":
							t1.rotate(Integer.parseInt(value)) ;	
							break ;
						case "B":
							s1.rotate(Integer.parseInt(value)) ;
							break ;
						case "C":
							r1.rotate(Integer.parseInt(value)) ;
							break ;
					}
					break ;
				}
			}

			frame.repaint(0, 0, 0, 400, 400) ;
		} 
	}
}
