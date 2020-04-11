package ProjectEuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Euler problem 26
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-11
 */


public final class Problem026 {
	private static final int PARA = 1000;
	
	public static void main(String[] args) {
		run();
	}
	
	private static void run() {
		int max = 0;
		for(int i = 2; i< PARA; i++) {
			max = max > cycle(i) ? max : cycle(i);
		}
		System.out.println(max);
	}
	
	// a refers to numerator
	// b refers to denominator
	// c refers to remainder
	private static int cycle(int b) {
		//initionalization
		int c = 1;
		Integer cnt = 0;
		List<Integer> re = new ArrayList<Integer>();
		while(c != 0) {
			while(c < b) {
				c *= 10;
			}
			c = c%b;
			if(re.contains(c) || c == 0) {
				break;
			}
			else {
				re.add(c);
				cnt++;
			}
		}
		
		return cnt;
	}
}
