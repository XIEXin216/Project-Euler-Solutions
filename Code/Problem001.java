package ProjectEuler;

/**
 * Project Euler problem 1
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-23
 */

public final class Problem001 {
	public static void main(String[] args) {
		new Problem001().run(1000);
	}

	/*
	 * Problem 1:
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	private void run(int N) {
		int sum = 0;
		
		for (int i = 1; i< N;i++) {
			if(i%3==0 || i%5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
