package hakerrank;

import java.time.LocalDate;

public class Date_and_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dd = 8;
		int mm = 1;
		int yy = 2022;
		
		LocalDate dt = LocalDate.of(yy, mm, dd);
		
		System.out.println(dt.getDayOfWeek().name());
		
		
		

	}

}
