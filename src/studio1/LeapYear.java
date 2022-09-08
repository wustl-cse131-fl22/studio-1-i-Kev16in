package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int currentYear = 2022;
    boolean isLeapYear = (currentYear % 4) == 0 && (currentYear % 100) > 0 && (currentYear % 400) == 0;
    System.out.println(isLeapYear);
    
	}

}
