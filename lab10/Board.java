import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.io.* ;
import java.util.* ;

public class Board 
{
	JPanel head ;
	JPanel body ;

	JTextField trialText ;
	JTextField flagText ;
	JLabel iconLabel ;
	Cell [][] cells ;

	boolean [][] mines ;
	boolean [][] uncovered ;
	int [][] counts ;
	int trials = 0 ;
	int flags = 0 ;

	Board(JFrame frame, String fpath) 
	{
		frame.setLayout(new BorderLayout()) ;
		head = new JPanel() ;
		head.setLayout(new FlowLayout()) ;
		body = new JPanel() ;
		body.setLayout(new GridLayout(9, 9)) ;
		frame.add(head, BorderLayout.NORTH) ;
		frame.add(body, BorderLayout.CENTER) ;

		trialText = new JTextField(Integer.toString(trials)) ;
		iconLabel  = new JLabel(new ImageIcon("smile.png")) ;
		flagText = new JTextField(Integer.toString(flags)) ;

		head.add(trialText) ;
		head.add(iconLabel) ;
		head.add(flagText) ;

		mines = new boolean[9][9] ;
		cells = new Cell[9][] ;
		counts = new int[9][9] ;
		uncovered = new boolean[9][9] ;

		//try {
			// TODO
		//}
		//catch (IOException e) {
		//	System.exit(1) ;
		//}
	}

	public void click(int y, int  x) 
	{
		if (cells[y][x].isMarked)
			return ; 

		trials += 1 ;
		this.trialText.setText(Integer.toString(trials)) ;
		_click(y, x) ;

		if (cells[y][x].isMine == true)
			iconLabel.setIcon(new ImageIcon("smile-fail.png")) ;

		checkWinningStatus() ;
	}

	public void _click(int y, int x) 
	{
		//TODO
	}

	public void mark(int y, int x) 
	{
		if (cells[y][x].isMarked == false) {
			cells[y][x].button.setText("!") ;
			this.flags += 1 ;
		}
		else {
			cells[y][x].button.setText("") ;
			this.flags -= 1 ;
		}
		this.flagText.setText(Integer.toString(flags)) ;
		cells[y][x].isMarked = !(cells[y][x].isMarked) ;
		
		checkWinningStatus() ;
	}

	private void checkWinningStatus()
	{
		int y, x ;
		for (y = 0 ; y < 9 ; y++) {
			for (x = 0 ; x < 9 ; x++) {
				if (uncovered[y][x] == false) 
					if (cells[y][x].isMine == false || cells[y][x].isMarked == false)
						return ;
			}
		}
		iconLabel.setIcon(new ImageIcon("smile-win.png")) ;
	}
}
