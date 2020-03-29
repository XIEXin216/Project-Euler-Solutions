package ProjectEuler;


/**
 * Project Euler problem 10
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-24
 */
public final class Problem010 {
	public static void main(String[] args) {
		new Problem010().run();
	}
	
	private static final int PARA = 2000000;
	
	private void run() {
		Long sum = 0L;
		
		for (int i = 2; i< PARA; i++) {
			if(isPrime(i)) {
				sum += Long.valueOf(i);
			}
		}
		
		System.out.println(sum);
	}
	
	private boolean isPrime(int a) {
		boolean flag = true;
		for (int i= 2; i<= Math.sqrt(a); i++) {
			if (a%i == 0)
				flag = false;
		}
		
		return flag;
	}
}
