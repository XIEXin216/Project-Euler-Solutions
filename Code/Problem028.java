package ProjectEuler;

/**
 * Project Euler problem 28: Number spiral diagonals
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-09
 */

public final class Problem028 {
	private static int PARA = 1001;
	public static void main(String[] args) {
		new Problem028().run();
	}
	
	private void run() {
		int sum = 1;  //sum initialization
		int num = 1;  //the first element
		int diag = 1; //diag by diag  spiral formed
		while(diag < PARA) {
			for(int i = 0; i< 4; i++) {
				num += diag + 1;
				sum += num;
			}
			diag += 2;
		}
		System.out.println(sum);
	}
}
