package ProjectEuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Project Euler problem 26
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-11
 */


public final class Problem026 {
	private static final int PARA = 1000;
	
	public static void main(String[] args) {
		for(int i = 2; i<= 10; i++) {
			System.out.println(i + "-->" + cycle(i));
		}
		
		run();
	}
	
	private static void run() {
		int max = 0;
		for(int i = 2; i< PARA; i++) {
			max = max > cycle(i) ? max : cycle(i);
//			if(max == 884)
//				System.out.println(i);
		}
		
		System.out.println(max);
	}
	
	/*
	 * a refers to numerator
	 * b refers to denominator
	 * c refers to remainder
	 */
	private static int cycle(int b) {
		//initionalization
		int c = 1;
		Integer cnt = 1;
		List<Integer> re = new ArrayList<Integer>();
		
		while(c < b) {
			c *= 10;
		}
		
		while(c != 0) {
			while(c < b) {
				c *= 10;
				cnt++;
			}
			
			c = c%b;
			
			if(re.contains(c)) {
				break;
			}
			else if( c == 0)
				cnt = 0;
			else {
				re.add(c);
				cnt++;
			}
			
		}
		
		return cnt;
	}
}
