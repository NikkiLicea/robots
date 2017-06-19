
public class FRCRobot implements HasWeight{
	
	private String name;
	private int weight;
	public static final int MAX_WEIGHT = 120;
	private final FRCRobot robot;
	
	public FRCRobot(String dName, int dWeight, FRCRobot dRobot){
		name = dName;
		weight = dWeight;
		robot = dRobot;
	}
	
	public String getName(){
		return name;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public FRCRobot getRobot(){
		return robot;
	}
	
	public void setName(String newName){
		name = newName; 
	}

	public void setWeight(int newWeight){
		weight = newWeight;
	}
	
}
