import java.util.Scanner;

public class HelloWorld2017 {
	String s = "Two";
	int o = Integer.parseInt(s);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1 / 4.0);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a + 3);
	
		int b = (int)(Math.random() * 6 + 1);
		
		int team = 1;
		int sum = 0;
		while(team < 3473){
			if(team % 3 == 0 || team % 4 == 0 || team % 7 == 0){
				sum += team;
			}
			else{
				System.out.println(sum);
			}
		}
		
//		for(int i = 0; i < 3473; i++){
//			if(i)
//		}
		
		int [] nums = new int[10];
		
		
	}
	
}
