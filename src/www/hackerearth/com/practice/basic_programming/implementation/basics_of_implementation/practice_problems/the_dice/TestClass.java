// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-dice-d4dc5b11/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.the_dice;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String input = sc.next();
		char[] chars = input.toCharArray();
		int result = 0;
		int n = chars.length;
		
		if (chars[n - 1] == '6') {
			result = -1;
		} else {
			for (char ch: chars) {
				if (ch != '6') {
					++result;
				}
			}
		}
		
		System.out.println(result);
	}
}
