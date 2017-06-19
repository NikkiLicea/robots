
public interface HasWeight {

	public int getWeight();
	
	public default boolean isHeavy(){
		if(getWeight() >= 100){
			return true;
		}
		else{
			return false;
		}
	}
}
