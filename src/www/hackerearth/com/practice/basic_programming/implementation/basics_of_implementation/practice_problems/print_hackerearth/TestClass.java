// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/print-hackerearth/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.print_hackerearth;

import java.util.*;
import java.io.*;

class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		sc.nextInt();
		String str = sc.next();
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char ch: chars) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		int count = Integer.MAX_VALUE;
		
		for (char ch : "hackert".toCharArray()) {
			if (!map.containsKey(ch)) {
				count = 0;
				break;
			} else {
				if (ch == 'c' || ch == 't' || ch == 'k') {
					count = Integer.min(count, map.get(ch));
				} else {
					count = Integer.min(count, map.get(ch) / 2);
				}
			}
		}
		
		System.out.println(count);
	}
}