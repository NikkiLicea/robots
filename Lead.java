
public class Lead extends Member{

	public Lead(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember) {
		super(dName, dGradeLevel, dSubteam, dIsReturningMember);
	}
	
	public String title;
	
	public void whatTitle(){
		if(title.equals("Lead")){
			title = getSubteam() + "Lead";
		}
		else{
			title = "";
		}
	}
	
	public boolean isComputerSlave(){
		if(title.equals(getSubteam() + "Lead")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getTitle(){
		return title;
	}

}
