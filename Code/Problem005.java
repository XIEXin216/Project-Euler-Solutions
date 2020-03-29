package ProjectEuler;

/**
 * Project Euler problem 5
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-23
 */
public final class Problem005 {
	public static void main(String[] args) {
		Problem005 p = new Problem005();
		System.out.println("The smallest number that can be divided by each of the numbers from 1 to 10 without any remainder is:");
		p.smallest_multiple(1, 10);
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: ");
		p.smallest_multiple(1, 20);
	}
	/*
	 * calculate the Smallest multiple from s to e, in which step is 1
	 */
	private void smallest_multiple(int s, int e) {
		Long result = Long.valueOf(s);
		for (int i = s+1; i<= e; i++ ) {
			result = least_common_multiple(result, Long.valueOf(i));
		}
		
		System.out.println(result);
	}
	
	/*
	 * calculate the Least Common Multiple of two numbers a and b.
	 */
	private Long least_common_multiple(Long a, Long b) {
		return a*b/greatest_common_divisor(a,b);
	}
	
	/*
	 * calculate the Greatest Common Divisor of two numbers a and b.
	 */
	private Long greatest_common_divisor(Long a, Long b) {
		Long r;
		while(b != 0L) {
			r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
}