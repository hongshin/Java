import java.io.* ;
import java.util.* ;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

public class HelloGoodbye
{

	public static void login(JFrame frame)
	{
		JPanel panel = new JPanel(new BorderLayout(5, 5));
	    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
    	label.add(new JLabel("Username", SwingConstants.RIGHT));
    	label.add(new JLabel("Password", SwingConstants.RIGHT));
    	panel.add(label, BorderLayout.WEST);

    	JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
    	JTextField username = new JTextField();
    	controls.add(username);
    	JPasswordField password = new JPasswordField();
    	controls.add(password);
    	panel.add(controls, BorderLayout.CENTER);

    	JOptionPane.showMessageDialog(frame, panel, "login", JOptionPane.QUESTION_MESSAGE);

		if (username.getText().equals("hongshin")) {
			if ((new String(password.getPassword())).equals("1234"))
				return ;
			else
				System.exit(1) ;
		}
		else {
			System.exit(1) ;
		}

	}

	public static void main(String [] args) 
	{

		JFrame frame = new JFrame("Window Title") ; 

		login(frame) ;
		
		JPanel panel = new JPanel() ;

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
		frame.setSize(400, 225) ;

		frame.getContentPane().add(panel) ;
		
		JMenuBar menuBar = new JMenuBar() ;

		JMenu menu = new JMenu("Menu") ;

		JMenuItem save 	 = new JMenuItem("Save") ;
		JMenuItem exit 	 = new JMenuItem("Exit") ;
		JMenuItem insert = new JMenuItem("Insert") ;

		menu.add(insert) ;
		menu.add(save) ;
		menu.add(exit) ;

		menuBar.add(menu) ;

		frame.setJMenuBar(menuBar) ;

		JTextArea text = new JTextArea("Hi.\n", 10, 30) ;
		JScrollPane sp = new JScrollPane(text) ;

		save.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser() ;
					fc.setCurrentDirectory(new File("weka.log")) ;
					//fc.setSelectedFile(new File("weka.log")) ;
					//fc.setFileSelectionMode(JFileChooser.FILES_ONLY) ;
					int rval = fc.showSaveDialog(null) ;
					if (rval == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile() ;
						text.append(f.getAbsolutePath()) ;
					}
				}
			}
		) ;

		exit.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object [] options = {"Cancel", "No", "Yes"} ;

					int n = JOptionPane.showOptionDialog(frame, "Will you exit?", "!",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[2]) ;
					System.out.println(n) ;
				}
			}
		) ;



		panel.add(sp) ;
		frame.setVisible(true) ;
	}
}
