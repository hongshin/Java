import java.util.* ;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MyActionListener implements ActionListener 
{
	JTextArea textArea ;
	String message ;


	public MyActionListener(JTextArea textArea, String message) 
	{
		this.textArea = textArea ;
		this.message = message ;
	}

	public void actionPerformed(ActionEvent e)
	{
		this.textArea.append(this.message + " ") ;
	}
}

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
		ButtonGroup group = new ButtonGroup() ;

		JRadioButtonMenuItem hello = new JRadioButtonMenuItem("Hello") ;
		JRadioButtonMenuItem goodbye = new JRadioButtonMenuItem("Goodbye") ;


		JMenu edit = new JMenu("Edit") ;
		JMenu insert = new JMenu("Insert") ;

		group.add(hello) ;
		group.add(goodbye) ;

		insert.add(hello) ;
		insert.add(goodbye) ;

		edit.add(insert) ;
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
