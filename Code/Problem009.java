package ProjectEuler;

/**
 * Project Euler problem 9
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-24
 */
public final class Problem009 {
	public static void main(String[] args) {
		new Problem009().run();
		System.out.println(new Problem009().run(1000));
	}
	
	public void run() {
		for(int i = 1; i<  500; i++) {
			for (int j = 1; j< 500; j++) {
				if(i < j && i*i + j*j == (1000-i-j)*(1000-i-j)) {
//					System.out.println("These three number are: " + i + "," + j + "," + (1000-i-j));
					System.out.println(i*j*(1000-i-j));
				}
			}
		}
	}
	
//	private static final int PERIMETER = 1000;
	
	public String run(int PERIMETER) {
		for (int a = 1; a < PERIMETER; a++) {
			for (int b = a + 1; b < PERIMETER; b++) {
				int c = PERIMETER - a - b;
				if (a * a + b * b == c * c) {
					// It is now implied that b < c, because we have a > 0
					return Integer.toString(a * b * c);
				}
			}
		}
		throw new AssertionError("Not found");
	}
}
