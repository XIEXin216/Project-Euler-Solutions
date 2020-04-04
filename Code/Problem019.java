package ProjectEuler;

/**
 * Project Euler problem 19
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-03
 */

public final class Problem019 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2000));
		new Problem019().run();
	}
	
	private void run() {
		int sum = 0;
		int cnt = 0;
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int year = 1901; year < 2000; year++) {
			for(int m = 1; m <= 12; m++) {
				if (isLeapYear(year) && m == 2)
					sum += months[m-1] +1;
				else
					sum += months[m-1];
				
				if(sum % 7 == 6)
					cnt++;
			}
			
		}
		
		if(sum % 7 == 6)
			cnt--;
		
		System.out.println(cnt);
	}
	
	private static boolean isLeapYear(int year) {
		if(year % 10 == 0) {
			if(year % 400 == 0)
				return true;
			else
				return false;
		}
		else if(year % 4 == 0)
			return true;
		else 
			return false;
	}
}
