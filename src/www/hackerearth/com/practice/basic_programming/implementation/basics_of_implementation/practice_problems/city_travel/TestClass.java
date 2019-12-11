// FIXME: 12/11/19
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/city-travel-59bad87f/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.city_travel;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long s = sc.nextLong();
		long x = sc.nextLong();
		long n = sc.nextInt();
		long distance = 0;
		long index = 0;
		
		HashMap<Long, Long> map = new HashMap<>();
		
		for (int i = 0; i < n; ++i) {
			long t = sc.nextLong();
			long y = sc.nextLong();
			
			map.put(t, y);
		}
		while (distance < s) {
			distance += map.getOrDefault(++index, x);
		}
		
		System.out.println(index);
	}
}
