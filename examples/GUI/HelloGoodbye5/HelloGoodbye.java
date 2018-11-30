import java.io.* ;
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
