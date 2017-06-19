import java.util.ArrayList;

public class fizzBuzz {

//	public static String[] fizzBuzz (int a, int b){
//		String[] ans = new String [b - a];
//		for(int i = a; i < b; i++){
//			if(i % 3 == 0 && i % 5 == 0){
//				ans[i - a] = "FizzBuzz";
//			}
//			else if(i % 3 == 0){
//				ans[i - a] = "Fizz";
//			}
//			else if(i % 5 == 0){
//				ans[i - a] = "Buzz";
//			}
//			else{
//				ans[i - a] = String.valueOf(i);
//			}
//		}
//		return ans;
//	}
	
	public static void main (String[] args){
//		String[] name = fizzBuzz(1, 20);
//		for(int i  = 0; i < name.length; i++){
//			System.out.println(name[i]);
//		}
		
		ArrayList <Integer> names = new ArrayList<>();
			for(int i =  1; i < 5; i++){
				names.add(i);
			}
			for(int i = 0; i < names.size(); i++){
				System.out.println(i);
			}
		
	}
}
