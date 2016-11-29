
import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void emptyBoardNoWinner(){
	//leeres Board, keine Gewinner
		Board board = new Board();
		assertFalse(board.hasWinner());	
	}
	  
	 @Test
		public void validFlagNoWinner(){
		//G�ltige Markierung, keine Gewinner
		 Board board = new Board();
		 int x = 0;
		 int y = 0;
			assertTrue(board.validTag(x, y));
			assertFalse(board.hasWinner());
		}
	 
	 @Test
		public void validFlagWithWinner(){
		//G�ltige Markierung, Gewinner	
		 Board board = new Board();
		 int x=2;
		 int y=2;
		 board.setMark("X", 0, 0);
		 board.setMark("X", 1, 1);
		 board.setMark("X", x, y);
			assertTrue(board.hasWinner(), board.validTag(x, y));
			
		}
	  
	 @Test
		public void invalidFlag(){
		//Ung�ltige Markierung
		 Board board = new Board();
		 int x = 2;
		 int y = 3;
		 board.setMark("X",	x, y);
			assertFalse(board.validTag(x, y));

		}  
}
