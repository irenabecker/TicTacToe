
import java.util.Scanner;


public class TicTacToe {
	
	public static void main(String[] args) {
		
		Board board = new Board ();
		Scanner scanner = new Scanner (System.in);
		String tag;
		int x;
		int y;
		
		while (board.hasWinner()== false){
			System.out.println("Pleaser Enter: [X or O] [x-value] [y-value]");
			tag = scanner.nextLine();
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			if (board.validTag(x, y)==true){
			board.setMark(tag, x, y);
			}
			else{
				System.out.println("This position is already taken");
			}
		}		
	}
}