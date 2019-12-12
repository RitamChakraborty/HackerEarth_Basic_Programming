// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/psychic-powers/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.little_jhool_and_psychic_powers;

import java.util.*;
import java.io.*;

class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String str = sc.next();
		char[] chars = str.toCharArray();
		char c = '0';
		int count = 0;
		boolean result = false;
		
		for (char ch : chars) {
			if (ch == c) {
				count++;
			} else {
				c = ch;
				count = 1;
			}
			
			if (count == 6) {
				result = true;
				break;
			}
		}
		
		System.out.println(result ? "Sorry, sorry!" : "Good luck!");
	}
}