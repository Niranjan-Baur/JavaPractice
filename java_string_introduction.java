package hakerrank;
import java.util.*;


public class java_string_introduction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

//		String cap1 = str1.substring(0,1).toUpperCase() + str1.substring(1);
//		String cap2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
//		
//		int str1len = str1.length();
//		int str2len = str2.length();
//		int sum = str1len + str2len;
//		
//		System.out.println(sum);
//		
//		if(str1.compareTo(str2)>0) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		System.out.println(cap1 + " " + cap2);
		
		System.out.println(str1.length() + str2.length());
		System.out.println(str1.compareTo(str2) > 0 ? "Yes" : "No");
		System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) + " " + str2.substring(0,1).toUpperCase() + str2.substring(1));
		
	}

}
