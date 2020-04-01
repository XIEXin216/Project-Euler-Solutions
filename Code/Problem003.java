package ProjectEuler;

/**
 * Project Euler problem 3
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-23
 */

public final class Problem003 {
	public static void main(String[] args) {
		new Problem003().run(600851475143L);		
	}
	
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. 
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	private void run(Long num) {
		Long divisor = num;
		boolean con = true;
		
		while(con) {
			for (int i = 2;i<Math.sqrt(num);i++) {
				if(divisor %i == 0) {
					divisor = divisor/i;
					System.out.println(i);
					con = true;
					break;
				}
				else {
					con = false;
					continue;
				}
			}
		}
		
		//the last prime factor
		if (divisor > Math.sqrt(num))
			System.out.println(divisor + " is a prime.");
	}
}
