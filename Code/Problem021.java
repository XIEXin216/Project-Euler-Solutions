package ProjectEuler;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Project Euler problem 21
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-03
 */

public final class Problem021 {
	public static void main(String[] args) {
		new Problem021().run();
	}
	
	private void run() {
		int sum = 0;
		for(int i = 2; i< 10000;i++) {
			if(setSum(getDivisors(setSum(getDivisors(i)))) ==  i && setSum(getDivisors(i)) != i)
				sum += i;
		}
		System.out.println(sum);
	}
	
	private static TreeSet<Integer> getDivisors(int num) {
		Set<Integer> divisors = new TreeSet<Integer>();
		
		divisors.add(1);
		for (int i = 2; i<= Math.sqrt(num);i++) {
			if (num%i==0) {
				divisors.add(i);
				divisors.add(num/i);
			}
		}
		
		return (TreeSet<Integer>)divisors;
	}
	
	private static int setSum(TreeSet<Integer> ts) {
		int sum = 0;
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		
		return sum;
	}
}
