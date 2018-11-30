import java.util.* ;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

public class HelloGoodbye
{
	public static void main(String [] args) 
	{
		JFrame frame = new JFrame("Window Title") ; 
		JPanel panel = new JPanel() ;

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 225) ;
		
		frame.getContentPane().add(panel) ;

		JTextArea text = new JTextArea("Hi.\n", 10, 30) ;

		JButton hello = new JButton("Hello") ;
		hello.setSize(150, 30) ;
		hello.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text.append("Hello ") ;
					hello.setVisible(false) ;
				}
			}
		) ;
		
		JButton goodbye = new JButton("Goodbye") ;
		goodbye.setSize(150, 30) ;
		goodbye.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text.append("Goodbye ") ;
					//goodbye.setVisible(false) ;
					goodbye.setEnabled(false) ;
				}
			} 
		) ;
		
		panel.add(text) ;
		panel.add(hello) ;
		panel.add(goodbye) ;

		frame.setVisible(true) ;
	}
}
