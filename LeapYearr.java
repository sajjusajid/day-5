package leapyear;
import java.util.*;

public class LeapYearr {

		public static void main(String[] args) {
					System.out.println("choose year");
					
					Scanner scYear = new Scanner(System.in);
					
					int year = scYear.nextInt();
					scYear.close();
					
					if(year > 999 && year <= 9999) {
						 if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
								System.out.println("Year is leap year");
						 }else {
								System.out.println("Not a leap year");
						 }
					}else {
						System.out.println("Please enter correct year");
					}
		}

	}

