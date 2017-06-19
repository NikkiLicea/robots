
public abstract class Game {
	private int redAllianceScore;
	private int blueAllianceScore;
	
	public Game(int dRedAllianceScore, int dBlueAllianceScore){
		redAllianceScore = dRedAllianceScore;
		blueAllianceScore = dBlueAllianceScore;
	}
	
	public int getRedAllianceScore(){
		return redAllianceScore;
	}
	
	public int getBlueAllianceScore(){
		return blueAllianceScore;
	}
	
	public void setRedAllianceScore(int newRedAllianceScore){
		redAllianceScore = newRedAllianceScore;
	}
	
	public void setBlueAllianceScore(int newBlueAllianceScore){
		blueAllianceScore = newBlueAllianceScore;
	}
}
