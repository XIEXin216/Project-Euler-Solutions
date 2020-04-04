package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Project Euler problem 18
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-04-02
 */

public final class Problem018 {
	private static final String[] data = {
			"75",
			"95 64",
			"17 47 82",
			"18 35 87 10",
			"20 04 82 47 65",
			"19 01 23 75 03 34",
			"88 02 77 73 07 63 67",
			"99 65 04 28 06 16 70 92",
			"41 41 26 56 83 40 80 70 33",
			"41 48 72 33 47 32 37 16 94 29",
			"53 71 44 65 25 43 91 52 97 51 14",
			"70 11 33 28 77 73 17 78 39 68 17 57",
			"91 71 52 38 17 14 91 43 58 50 27 29 48",
			"63 66 04 68 89 53 67 30 73 16 69 87 40 31",
			"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};
	
	public static void main(String[] args) {
//		System.out.println(BigInteger.valueOf(2L).pow(14));
//		new Problem018().printData();
		new Problem018().run();
	}
	
	private void run() {
		
		Map<String,ArrayList<Integer>> sumMap = new HashMap<String,ArrayList<Integer>>();
		for(int i = 0; i< data.length;i++) {
			String[] lineValues = data[i].split(" ");
			for (int j = 0; j< lineValues.length;j++) {
				
				int value = Integer.valueOf(lineValues[j]);
				List<Integer> tmpList = new ArrayList<Integer>();
				
				//the first element in the first line
				if(i == 0 && j == 0)
					tmpList.add(value);
				//the first element in each line
				else if(j == 0) {
					tmpList.add(value + sumMap.get(i-1 + "," + 0).get(0));
				}
				//the last element in each line
				else if(j == lineValues.length - 1) {
					tmpList.add(value + sumMap.get(i-1 + "," + (i-1)).get(0));
				}
				//other elements except the first one and the last one in each line
				else {
					//(i-1,j-1)-->(i,j)
					ArrayList<Integer> a = sumMap.get(i-1 + "," + (j-1));
					Iterator<Integer> ita = a.iterator();
					while(ita.hasNext()) {
						tmpList.add(value + ita.next());
					}
					
					//(i-1,j)-->(i,j)
					ArrayList<Integer> b = sumMap.get(i-1 + "," + (j));
					Iterator<Integer> itb = b.iterator();
					
					while(itb.hasNext()) {
						tmpList.add(value + itb.next());
					}
				}
				
				sumMap.put((i + "," + j), (ArrayList<Integer>) tmpList);
			}
		}
		
		Set<Entry<String, ArrayList<Integer>>> entrySet = sumMap.entrySet();
		
		Iterator<Map.Entry<String, ArrayList<Integer>>> it = entrySet.iterator();
		int max = 0;
		while(it.hasNext()) {
			Map.Entry<String, ArrayList<Integer>> me = it.next();
			ArrayList<Integer> sumList = me.getValue();
			Iterator<Integer> g = sumList.iterator();
			while(g.hasNext()) {
				int tmp = g.next();
				max = max > tmp ? max : tmp;
			}
		}
		System.out.println(max);
	}
	
	/*
	 * print triangle
	 */
	private void printData() {
		int row = data.length;
		int column = data[data.length-1].split(" ").length;
		int[][] m = new int[row][column];

		for(int i = 0; i< row; i++) {
			for (int j = 0; j< column; j++) {
				for(int k = 0; k < data[i].split(" ").length; k++) {					
					m[i][k] = Integer.valueOf(data[i].split(" ")[k]); 
				}
			}
		}

		for(int i = 0; i< m.length; i++) {
			for(int j = 0; j < m[0].length;j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
