
public class Member implements Spirited, HasWeight{
	private String name;
	private int gradeLevel;
	private String subteam;
	private boolean isReturningMember;
	private int weight;
	
	public Member(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember){
		name = dName;
		gradeLevel = dGradeLevel;
		subteam = dSubteam;
		isReturningMember = dIsReturningMember;
	}

	public String getSubteam(){
		return subteam;
	}

	public boolean getReturningMember(){
		return isReturningMember;
	}
	
	public String getName(){
		return name;
	}
	
	public int getGradLevel(){
		return gradeLevel;
	}

	public int getWeight(){ 
		return weight;
	}
	
	public void setSubteam(String newSubteam){
		subteam = newSubteam;
	}

	public void setReturningMember(boolean newReturningMember){
		isReturningMember = newReturningMember;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setGradeLevel(int newGradeLevel){
		gradeLevel = newGradeLevel;
	}
	
	public void setWeight(int newWeight){
		weight = newWeight;
	}

	public void graduate(){
		gradeLevel++;
		isReturningMember = true;
	}

	public boolean isComputerSlave(){
		if(subteam.equals("programming")){
			return true;
		}
		else if(subteam.equalsIgnoreCase("CAD")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static char getFirstInitialOfName(String n){
		return n.charAt(0);
	}

	@Override
	public String showTeamSpirit() {
		return null;
	}



}
