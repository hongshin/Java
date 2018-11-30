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
		
		JMenuBar menuBar = new JMenuBar() ;
		JMenu   file = new JMenu("File") ;
		JMenu	edit = new JMenu("Edit") ;

		JMenu   hellogoodbye = new JMenu("Hello Goodbye") ;

		JMenuItem hello = new JMenuItem("Hello") ;
		JMenuItem goodbye = new JMenuItem("Goodbye") ;

		hellogoodbye.add(hello) ;
		hellogoodbye.add(goodbye) ;

		edit.add(hellogoodbye) ;

		menuBar.add(file) ;
		menuBar.add(edit) ;

		frame.setJMenuBar(menuBar) ;

		JTextArea text = new JTextArea("Hi.\n", 10, 30) ;

		hello.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text.append("Hello ") ;
				}
			}
		) ;
		
		goodbye.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text.append("Goodbye ") ;
				}
			} 
		) ;
		
		panel.add(text) ;
		frame.setVisible(true) ;
	}
}
