package ProjectEuler;

import java.math.BigInteger;

/**
 * Project Euler problem 16
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-30
 * https://github.com/XIEXin216/Project-Euler-Solutions
 */

public final class Problem016 {
	public static void main(String[] args) {
		new Problem016().run();
	}
	
	private void run() {
		String s = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += Integer.valueOf(s.charAt(i) -48);
		}
		
		System.out.println(sum);
	}
}
