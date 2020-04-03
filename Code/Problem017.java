package ProjectEuler;

/**
 * Project Euler problem 17
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-31
 */

public final class Problem017 {
	private static final String[] s1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static final String[] s2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static final String[] s3 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	public static void main(String[] args) {
		new Problem017().run();
	}
	
	/*
	 * S1 = {one, two, three, four, five, six, seven, eight, nine}
	 * S2 = {ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen}
	 * S3 = {twenty， thirty， forty， fifty， sixty， seventy， eighty， ninety}
	 * 
	 * all number can be described by set {and},{hundred},{thousand},S1,S2 and S3
	 * S4 = {100,200,300,400,500,600,700,800,900} = S1 + {hundred}*9
	 * 
	 * S5 = {1-99} = {1-20} + {21-99} = (S1 + S2) + (S3*10 + S1*8)
	 *    = S1*9 + S2 + S3*10 // 99 elements
	 * S6 = {1-999} = S5*10 + S4*100 + {and}*891
	 *    = S1*90 + S2*10 + S3*100 + S1*100 + {hundred}*900 + {and}*891
	 *    = S1*190 + S2*10 + S3*100 +{hundred}*900 + {and}*891
	 *    
	 * S7 = {one thousand}
	 * S8 = {1-1000} = S6 + S7
	 *    = S1*190 + S2*10 + S3*100 + {hundred}*900 + {and}*891 + {one} + {thousand}
	 */
	private void run() {
		
		int sum1 = 0;
		for(int i = 0; i< s1.length; i++) {
			sum1 += s1[i].length();
		}
		System.out.println(sum1);
		sum1 = sum1*190;
		
		int sum2 = 0;
		for(int j = 0; j < s2.length; j++) {
			sum2 += s2[j].length();
		}
		sum2 = sum2*10;
		
		int sum3 = 0;
		for(int k = 0; k < s3.length; k++) {
			sum3 += s3[k].length();
		}
		sum3 = sum3*100;
		
		int len = sum1 + sum2 + sum3 + ("hundred".length())*900 + ("and".length())*891 + "one".length() + "thousand".length();
		System.out.println(len);
	}
	
}
