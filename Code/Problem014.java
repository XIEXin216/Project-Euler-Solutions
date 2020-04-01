package ProjectEuler;

/**
 * Project Euler problem 14
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-30
 * https://github.com/XIEXin216/Project-Euler-Solutions
 */

public final class Problem014 {
	public static void main(String[] args) {
		new Problem014().run();
	}
	
	private void run() {
		int num = 1;
		int maxChain = 1;
		for(int i = 1; i< 1000000; i++) {
			if(CollatzSequenceLength(i)>maxChain) {
				maxChain = CollatzSequenceLength(i);
				num = i;
			}
		}
		System.out.println(num);
	}
	
	private int CollatzSequenceLength(long num) {
		int len = 1;
		while(num != 1) {
//			System.out.print(num + "-->");
			len++;
			if(num % 2 == 0)
				num = num/2;
			else
				num = 3*num + 1;
		}
//		System.out.println("1");
//		System.out.println(len);
		return len;
	}
}
