package week3.addCommasToString;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		 while (true) {
			 String digits = readLine("Enter a numeric string: ");
			 if (digits.length() == 0) break;
			 String n=(addCommasToNumericString(digits));
			 System.out.println("the number with coma is:"+n);
		 }
	}
	private String addCommasToNumericString(String digits) {
		String num = "";
		while(digits.length()>3) {
			String piece= digits.substring(digits.length()-3);
			digits=digits.substring(0,digits.length()-3);
			num=','+ piece + num;
		}
		if(digits.length()>0) {
			num = digits +  num;
			return num;
		} else {
			return num;
		}
	}
}
