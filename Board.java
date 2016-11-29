
public class Board{

private String [] [] position = new String [3][3];
private boolean winner = false;
private int x;
private int y;
 
	public Board(){
		

	}

	public void setMark(String mark, int x, int y) {
	//public void setMark(String mark, int x, int y) throwsInvalidPositionException {
		if ((x == 0| x == 1| x == 2) && (y == 0| y == 1| y == 2)){
			
			position [x] [y] = mark;
		}
		else{
			System.out.println("This mark is not avaiable");
		}
	}

	public boolean hasWinner(){
	
			for (int j = 0; j<=2; j++){
						if (position [0][j] == position [1][j] && position [2][j] == position [1][j]){
							winner = true;
						}	
			}
			for (int j = 0; j<=2; j++){
						if (position [j][0] == position [j][1] && position [j][2] == position [j][1]){
							winner = true;
						}
			}
			
			if (position[0][2] ==  position[1][1]  && position [2][0] == position[1][1]){
					winner = true;
			}
			if (position[0][0] ==  position[1][1]  && position [2][2] == position[1][1]){
				winner = true;
		}
			return winner;
	
	}
	
	public boolean validTag(int x, int y){
		
		x = this.x;
		y = this.y;
		
			if(position [x][y].equals("X")||position [x][y].equals("O")){
				return false;
			}
			return true;
	
	}
	
}
