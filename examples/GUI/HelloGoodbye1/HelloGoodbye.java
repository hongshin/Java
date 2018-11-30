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
		JFrame frame = new JFrame("Hello Goodbye") ; 

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 225) ;
		
		JTextArea text = new JTextArea("Hi.\n", 10, 30) ;

		JButton hello = new JButton("Hello") ;
		//hello.setSize(150,30) ; // hello.setBounds(10, 175, 150, 30) ;
		hello.addActionListener(new MyActionListener(text, "Hello")) ; 
		JButton goodbye = new JButton("Goodbye") ;
//		goodbye.setSize(150, 30) ; //goodbye.setBounds(210, 175, 150, 30) ;
		goodbye.addActionListener(new MyActionListener(text, "Goodbye")) ;
		
		frame.getContentPane().add(text, BorderLayout.CENTER) ;
		frame.getContentPane().add(hello, BorderLayout.NORTH) ;
		frame.getContentPane().add(goodbye, BorderLayout.SOUTH) ;
		frame.setVisible(true) ;
	}
}
