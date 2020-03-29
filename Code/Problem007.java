package ProjectEuler;

/**
 * Project Euler problem 7
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-25
 */

public final class Problem007 {
	public static void main(String[] args) {
		new Problem007().prob7(10001);
	}

	private void prob7(int N) {
		int i = 1;
		int s = 2;
		while(i != N) {
			s++;
			if(isPrime(s))
				i++;
		}
		System.out.println("The 10 001st prime number is: " + s);
	}
	
	/*
	 * 
	 */
	private boolean isPrime(int a) {
		boolean flag = true;
		for (int i= 2; i<= Math.sqrt(a); i++) {
			if (a%i == 0)
				flag = false;
		}
		
		return flag;
	}
}
