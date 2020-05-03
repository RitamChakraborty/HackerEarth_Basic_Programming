// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-seven-segments-1/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.jarvis_and_seven_segment;

import java.util.*;
import java.io.*;

class TestClass {
	private static int getSevenSegmentNum(int n) {
		switch (n) {
			case 0:
			case 6:
			case 9:
				return 6;
			case 1:
				return 2;
			case 2:
			case 3:
			case 5:
				return 5;
			case 4:
				return 4;
			case 7:
				return 3;
			case 8:
				return 7;
			default:
				return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] strings = new String[n];
			int min = Integer.MAX_VALUE;
			String digit = "";
			
			for (int i = 0; i < n; ++i) {
				String str = sc.next();
				strings[i] = str;
			}
			
			for (String input: strings) {
				char[] chars = input.toCharArray();
				int count = 0;
				
				for (char ch: chars) {
					count += getSevenSegmentNum(Character.getNumericValue(ch));
				}
				
				if (count < min) {
					min = count;
					digit = input;
				}
			}
			
			System.out.println(digit);
		}
	}
}