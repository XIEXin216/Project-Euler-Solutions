package ProjectEuler;

/**
 * Project Euler Toolkit
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-29
 */

public class Toolkit {
	public static void main(String[] args) {
		int[][] a = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		new Toolkit().printMatrix(a);
	}
	
	public void printMatrix(int[][] a) {
		int len = a.length;
		int wid = a[0].length;
		for (int i = 0; i< len; i++) {
			for (int j = 0; j< wid; j++) {
				if(j != wid - 1)
					System.out.print(a[i][j] + "\t");
				else
					System.out.println(a[i][j]);
			}
		}
	}

	public void printMatrix(String[][] a) {
		int len = a.length;
		int wid = a[0].length;
		for (int i = 0; i< len; i++) {
			for (int j = 0; j< wid; j++) {
				if(j != wid - 1)
					System.out.print(a[i][j] + "\t");
				else
					System.out.println(a[i][j]);
			}
		}
	}
}