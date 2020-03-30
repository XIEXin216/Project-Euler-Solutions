package ProjectEuler;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

/**
 * Project Euler problem 11
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-29
 */

public final class Problem011 {
	public static void main(String[] args) {
		new Problem011().run();

	}
	
	private void run(){
		List<String> dataList = new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader("//Users//sherman//Documents//GitHub//Project-Euler-Solutions//Data//data_p011.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			
			while((line = br.readLine()) != null) {
				dataList.add(line);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
		int rowN = dataList.size();
		int columnN = dataList.get(0).split(" ").length;
//		System.out.println(rowN + ", " + columnN);
		
		int[][] data = new int[rowN][columnN];
		for(int i = 0; i< rowN; i++) {
			String[] lineData = dataList.get(i).split(" ");
			for (int j = 0; j< columnN; j++) {
				data[i][j] = Integer.valueOf(lineData[j]);
			}
		}
		
		//print the matrix
//		new Toolkit().printMatrix(data);
		
		int LEN = 4;
		//find the maximum of the prod in all rows and all columns
		Long prodMax = 1L;
		
		//horizontal and vertical
		for(int i = 0; i< rowN; i++) {
			Long prod = 1L;
			for (int j = 0; j < columnN; j++) {
				Long prodR = 1L;
				Long prodC = 1L;
				for (int k = 0; (k < LEN); k++) {
					if (j <= columnN - LEN) 
						prodR *= Long.valueOf(data[i][j+k]);
					
					if (i <= rowN - LEN)
						prodC *= Long.valueOf(data[i+k][j]);
				}
				prod = prodR > prodC ? prodR : prodC;
			}
			prodMax = prodMax > prod ? prodMax : prod;
		}
		
		//left up --> right down
		for(int i = 0; i <= rowN - LEN; i++) {
			Long prod = 1L;
			for (int j = 0; j<= columnN - LEN; j++) {
				Long prodD = 1L;
				for(int k = 0; k < LEN; k++) {					
					prodD *= Long.valueOf(data[i+k][j+k]);
				}
				prod = prod > prodD ? prod : prodD;
			}
			prodMax = prodMax > prod ? prodMax : prod;
		}
		
		//left down --> right up
		for (int i = LEN-1; i < rowN; i++) {
			Long prod = 1L;
			for (int j = 0; j <= columnN - LEN; j++) {
				Long prodD = 1L;
				for (int k = 0; k< LEN; k++) {
					prodD *= Long.valueOf(data[i-k][j+k]);
				}
				prod = prod > prodD ? prod : prodD;
			}
			prodMax = prod > prodMax ? prod : prodMax;
		}
		
		System.out.println(prodMax);
	}
}
