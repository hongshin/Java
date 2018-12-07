import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class Cell 
{
	Board board ;
	int y, x ;
	JPanel panel ;
	JButton button ;
	JLabel label ;
	boolean isMine ;
	boolean isMarked ;

	public Cell(Board board, int y, int x, int count, boolean isMine) 
	{
		this.board = board ;
		this.y = y ;
		this.x = x ;
		this.isMine = isMine ;
		this.isMarked = false ;
		panel = new JPanel() ;
		panel.setSize(new Dimension(30, 30)) ;
		panel.setLayout(new GridLayout(1,1)) ;
		
		if (isMine) {
			label = new JLabel(new ImageIcon("mine.png")) ;
		}
		else {
			label = new JLabel(Integer.toString(count)) ;
		}

		button = new JButton() ;
		button.setSize(new Dimension(30,30)) ;
		button.addMouseListener(new MouseListener() 
			{
				public void mousePressed(MouseEvent me) { }
        		public void mouseReleased(MouseEvent me) { }
        		public void mouseEntered(MouseEvent me) { }
        		public void mouseExited(MouseEvent me) { }
				public void mouseClicked(MouseEvent e) {
					switch (e.getModifiers()) {
						case InputEvent.BUTTON1_MASK : {
							board.click(y, x) ;
							break ;
						}
						case InputEvent.BUTTON3_MASK : {
							board.mark(y, x) ;
							break ;
						}
					}
				}
			}
		) ;
		panel.add(button) ;
	}

	public void uncover()
	{
		button.setVisible(false) ;
		panel.setLayout(new FlowLayout()) ;
		panel.add(label) ;
		if (this.isMine)
			panel.setBackground(Color.red) ;
	}
}
