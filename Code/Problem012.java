package ProjectEuler;

/**
 * Project Euler problem 12
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-29
 */

public final class Problem012 {
	public static void main(String[] args) {
		new Problem012().run();
	}
	
	private void run() {
		int divCnt = 1;
		int i = 1;
		while(divCnt < 500) {
			divCnt = divisorCnt(i*(i+1)/2);
			i++;
		}
		System.out.println(i*(i-1)/2);
		
	}
	
	/*
	 * calculate the number of divisors of a triangle number
	 */
	private int divisorCnt(int num) {
		int cnt = 0;
		for (int i = 1; i<= Math.sqrt(num);i++) {
			if(i==Math.sqrt(num)) {
				cnt++;			
			}else if (num%i==0) {
				cnt += 2;
			}
		}
		return cnt;
	}
}
