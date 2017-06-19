import java.util.Scanner;

public class Grade {
	public static double grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		grade = a;
		letter();
	}
	
	public static void letter(){
		if(grade >= 90.0){
			System.out.println("A");
		}
		else if(grade >= 80.0){
			System.out.println("B");
		}
		else if(grade >= 70.0){
			System.out.println("C");
		}
		else if(grade >= 60.0){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}
