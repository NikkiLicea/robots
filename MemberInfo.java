
public class MemberInfo extends Member {
	
	public MemberInfo(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember){
		super(dName, dGradeLevel, dSubteam, dIsReturningMember);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberInfo Bella = new MemberInfo("Bella", 9, "Operations", false);
		MemberInfo Jessica = new MemberInfo("Jessica", 10, "CAD", true);
		MemberInfo Diana = new MemberInfo("Diana", 12, "Electrical", true);
	}

}
