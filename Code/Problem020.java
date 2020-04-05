package ProjectEuler;

import java.math.BigInteger;
/**
 * Project Euler problem 20
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-03
 */

public final class Problem020 {
	private final int LEN = 100;
	public static void main(String[] args) {
		new Problem020().run();
	}
	
	private void run() {
		BigInteger prod = BigInteger.valueOf(1L);
		for(int i = 1; i <= LEN; i++) {
			prod = BigInteger.valueOf(i).multiply(prod);
		}
//		System.out.println(prod);
		
		String s = prod.toString();
		int sum = 0;
		for(int x = 0; x < s.length();x++) {
			sum += Integer.valueOf(s.charAt(x) - '0');
		}
		System.out.println(sum);
	}
}
