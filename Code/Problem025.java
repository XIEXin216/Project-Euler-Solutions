package ProjectEuler;

import java.math.BigInteger;

/**
 * Project Euler problem 25
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-05
 */

public final class Problem025 {
	private static final int DIGITS = 1000;
	public static void main(String[] args) {
		new Problem025().getFibonacciIndex();
	}
	
	private void getFibonacciIndex() {
		BigInteger fn1 = BigInteger.valueOf(1L);
		BigInteger fn2 = BigInteger.valueOf(1L);
		int i = 3;
		BigInteger fn = BigInteger.valueOf(0L); //initialization
		while(fn.toString().length() < DIGITS) {
			fn = fn1.add(fn2);
			fn1 = fn2; 
			fn2 = fn;
			i++;
		}
		System.out.println(i-1);
	}
}
