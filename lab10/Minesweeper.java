import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class Minesweeper
{
  private static JFrame frame ;
  private static Board board ;

  public static void main(String [] args)
  {
    frame = new JFrame("Minesweeper") ;
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    frame.setSize(270, 300) ;

	board = new Board(frame, "minemap.dat") ;

    frame.setVisible(true) ;
  }
}
