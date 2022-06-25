import java.util.Scanner;

public class RverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		String str = scn.nextLine();
		System.out.println(str);
		
		System.out.println("After Reverse");
		
		System.out.println(reverseStr(str));
	}
	
	public static String reverseStr(String str) {
		
		int len = str.length();
		String str2 = "";
		
		for(int i=(len-1); i>=0; i--) {
			str2 = str2 + str.substring(i, i+1);
		}
		
		return str2;
	}

}
