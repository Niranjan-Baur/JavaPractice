package hakerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		Locale indiaLocale = new Locale("en", "IN");
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(n);
		String india = NumberFormat.getCurrencyInstance(indiaLocale).format(n);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(n);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n);
		
//		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
	}

}
