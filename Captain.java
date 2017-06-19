
public class Captain extends Member{

	public Captain(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember){
		super(dName, dGradeLevel, dSubteam, dIsReturningMember);
	}

	public String title;

	public void whatTitle(){
		if(getSubteam().equals("Operations") || getSubteam().equals("PR") || getSubteam().equals("Design") && title.equals("Captain")){
			title = "Business Captain";
		}
		else if(getSubteam().equals("Programming") || getSubteam().equals("Mechanical") || getSubteam().equals("Electrical") || getSubteam().equals("CAD") && title.equals("Captain")){
			title = "Engineering Captain";
		}
		else{
			title = "";
		}
	}
	
	public boolean isComputerSlave(){
		if(title.equals(getSubteam() + "Captain")){
			return false;
		}
		else{
			return true;
		}	
	}
	
	public String getTitle(){
		return title;
	}
}
