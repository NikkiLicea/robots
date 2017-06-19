import java.util.ArrayList;

public class FRCGame extends Game{
	private FRCTeam red1;
	private FRCTeam red2;
	private FRCTeam red3;
	private FRCTeam blue1;
	private FRCTeam blue2;
	private FRCTeam blue3;
	private int num;
	
	int[] games = new int [num];
	//ArrayList<Integer> game = new ArrayList<>();
	
	public FRCGame(FRCTeam dRed1, FRCTeam dRed2, FRCTeam dRed3, FRCTeam dBlue1, FRCTeam dBlue2, FRCTeam dBlue3, int dRedAllianceScore, int dBlueAllianceScore){
		super(dRedAllianceScore, dBlueAllianceScore);
		red1 = dRed1;
		red2 = dRed2;
		red3 = dRed3;
		blue1 = dBlue1;
		blue2 = dBlue2;
		blue3 = dBlue3;
	}
	
	public FRCTeam getRed1(){
		return red1;
	}

	public FRCTeam getRed2(){
		return red2;
	}
	
	public FRCTeam getRed3(){
		return red3;
	}
	
	public FRCTeam getBlue1(){
		return blue1;
	}
	
	public FRCTeam getBlue2(){
		return blue2;
	}
	
	public FRCTeam getBlue3(){
		return blue3;
	}
	
	public int[] getGames(){
		return games;
	}
	
	public void setRed1(FRCTeam newRed1){
		red1 = newRed1;
	}
	
	public void setRed2(FRCTeam newRed2){
		red2 = newRed2;
	}
	
	public void setRed3(FRCTeam newRed3){
		red3 = newRed3;
	}
	
	public void setBlue1(FRCTeam newBlue1){
		blue1 = newBlue1;
	}
	
	public void setBlue2(FRCTeam newBlue2){
		blue2 = newBlue2;
	}
	
	public void setBlue3(FRCTeam newBlue3){
		blue3 = newBlue3;
	}
	
	public void setGames(int newGames[]){
		games = newGames;
	}
	
	public boolean isBlueAlliance(FRCTeam blueTeam){
		if(blueTeam == blue1 || blueTeam == blue2 || blueTeam == blue3){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isRedAlliance(FRCTeam redTeam){
		if(redTeam == red1 || redTeam == red2 || redTeam == red3){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getAllianceScore(FRCTeam team){
		if(isRedAlliance(team) == true){
			return getRedAllianceScore();
		}
		else if(isBlueAlliance(team) == true){
			return getBlueAllianceScore();
		}
		else{
			return -1;
		}
	}
	
	public int getAverageScore(){
		int storage = 0;
		for(int i = 0; i < num; i++){
			storage += games[i];
		}
		return storage/num;
	}
	
	
}
