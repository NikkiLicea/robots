import java.util.ArrayList;

public abstract class Team{
	private String name;
	private int teamNumber;
	private final int rookieYear;
	public static final int NUMBER_OF_FRC_TEAMS_IN_2017 = 3357;
	public static final String EXPANSION_OF_FIRST = "For Inspiration and Recognition of Science and Technology";
	ArrayList<Member> member = new ArrayList<>();
	
	public Team(String dName, int dTeamNumber, int dRookieYear){
		name = dName;
		teamNumber = dTeamNumber;
		rookieYear = dRookieYear;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTeamNumber(){
		return teamNumber;
	}
	
	public int getRookieYear(){
		return rookieYear;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setTeamNumber(int newTeamNumber){
		teamNumber = newTeamNumber;
	}
	
	public void addMember(Member newMember){
		member.add(newMember);
	}
	
	public void getAllSubteamMembers(String newSubteam){
		for(int i = 0; i < member.size(); i++){
			Member sub  = member.get(i);
			if(sub.getSubteam().equals(newSubteam)){
				System.out.println(i); 
			}
			else{
				System.out.println("");
			}
		}
	}
	
	public abstract String get2017Game();
	
}
