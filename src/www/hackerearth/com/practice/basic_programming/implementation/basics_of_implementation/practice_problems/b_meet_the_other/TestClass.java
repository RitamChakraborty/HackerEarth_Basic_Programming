// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/meet-the-other/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.b_meet_the_other;

import java.util.*;
import java.io.*;

class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		
		while (t-- > 0) {
			HashMap<String, Integer> map = new HashMap<>();
			int result = Integer.MAX_VALUE;
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				String string = sc.next();
				
				if (map.containsKey(string)) {
					int diff = i - map.get(string);
					result = Integer.min(result, diff);
				}
				
				map.put(string, i);
			}
			
			System.out.println(result == Integer.MAX_VALUE ? -1 : result);
		}
	}
}
