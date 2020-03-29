package ProjectEuler;

/**
 * Project Euler problem 6
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-23
 */
public class Problem006 {
	public static void main(String[] args) {
//		new Problem006().p6(10);
		new Problem006().p6(100);
	}
	
	/*
	 * Problem 6
	 */
	public void p6(int N) {
		int dif = 0;
		for(int i = 1;i<=N;i++) {
			dif += i * (N*(N+1)/2 - i);
		}
		System.out.println(dif);
	}
}
