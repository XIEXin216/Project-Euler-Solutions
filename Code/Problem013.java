package ProjectEuler;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Project Euler problem 13
 * @Copyright ©2020 XIEXin. All rights reserved. 
 * @date 2020-03-30
 */

public final class Problem013 {
	public static void main(String[] args) {
		new Problem013().run();
	}
	
	private void run() {
		List<String> dataList = new ArrayList<String>();
		
		//get the data from file
		try {
			FileReader fr = new FileReader("//Users//sherman//Documents//GitHub//Project-Euler-Solutions//Data//data_p013.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String buf = null;
			
			while((buf = br.readLine()) != null) {
				dataList.add(buf);
			}
			
			br.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		
		String sumString = "";
		int quotient = 0;
		int remainder = 0;
		for(int j = 49; j >= 0; j--) {
			int sum = 0;
			
			//calculate sum of the same digit in all lines
			for(int i = 0; i < dataList.size(); i++) {
				sum += Integer.valueOf(dataList.get(i).charAt(j)-48);
			}
			if(j >0) {
				remainder = (sum+ quotient)%10;
				quotient = (sum+quotient)/10;				
			}else {
				remainder = sum + quotient;
			}
//			System.out.println(j + ":" + sum + "," + quotient + "," + remainder);
			sumString = String.valueOf(remainder) + sumString;
		}
		
		System.out.println(sumString.substring(0,10));
	}

}