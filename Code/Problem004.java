package ProjectEuler;

/**
 * Project Euler problem 4
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-23
 */

public final class Problem004 {
	public static void main(String[] args) {
		new Problem004().run();
	}
	
	private void run() {
		int max = 0;
		
		for (int i = 999; i >=555; i--) {
			for (int j = i; j>= 100; j--) {
				String prod = Integer.toString(i*j);
				if(isPalindromic(prod)) {
					if(Integer.valueOf(prod)>max)
						max = Integer.valueOf(prod);
				}
			}
		}
		
		System.out.println(max);
	}
	
	private boolean isPalindromic(String str) {
		String[] s = str.split("");
		int len = s.length;
		int sum = 0;
		
		for(int i = 0; i< len/2; i++) {
			if(s[i].equals(s[len-i-1])) {				
				sum++;
			}
		}
		
		if (sum == len/2)
			return true;
		else
			return false;
	}

}
