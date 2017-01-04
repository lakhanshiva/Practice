/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RomanToDecimal
{
	public static void romanToDecimal(java.lang.String romanNumber){
		int decimal = 0;
		int prevNumber = 0;
		String romanNumeric = romanNumber.toUpperCase();
		for (int n = romanNumeric.length() - 1; n>=0; n-- ){
			char convertToDecimal = romanNumeric.charAt(n);
			
			switch(convertToDecimal) {
				case 'M':
					decimal = getDecimal(1000,prevNumber,decimal);
					prevNumber = 1000;
					break;
				case 'D':
					decimal = getDecimal(500,prevNumber,decimal);
					prevNumber = 500;
					break;
				case 'C':
					decimal = getDecimal(100,prevNumber,decimal);
					prevNumber = 100;
					break;
				case 'L':
					decimal = getDecimal(50,prevNumber,decimal);
					prevNumber = 50;
					break;
				case 'X':
					decimal = getDecimal(10,prevNumber,decimal);
					prevNumber = 10;
					break;
				case 'V':
					decimal = getDecimal(5,prevNumber,decimal);
					prevNumber = 5;
					break;
				case 'I':
					decimal = getDecimal(1,prevNumber,decimal);
					prevNumber = 1;
					break;
			}
		}
		System.out.println(decimal);
	}
	
	public static int getDecimal(int decimalValue, int prevNumber, int decimal){
		if (prevNumber > decimalValue){
			return decimal - decimalValue;
		} else {
			return decimal + decimalValue;
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		romanToDecimal("XV");
	}
}