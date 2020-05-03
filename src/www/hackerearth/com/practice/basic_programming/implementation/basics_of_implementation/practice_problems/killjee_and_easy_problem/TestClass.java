// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/approximate/killjee-and-easy-problem/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.killjee_and_easy_problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
	private static StringJoiner sj = new StringJoiner(" ");
	private static Set<Integer> result = new HashSet<>();
	
	private static void func(Map<Integer, Set<Integer>> map, int index) {
		if (!result.contains(index)) {
			for (int i: map.get(index)) {
				if (!result.contains(i)) {
					result.add(index);
					result.add(i);
					sj.add(String.valueOf(index)).add(String.valueOf(i));
				}
				
				func(map, i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Map<Integer, Set<Integer>> map = new HashMap<>();
		
		for (int i = 0; i < n; ++i) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			
			if (!map.containsKey(v)) {
				map.put(v, new HashSet<>());
			}
			
			if (!map.containsKey(e)) {
				map.put(e, new HashSet<>());
			}
			
			map.get(v).add(e);
			map.get(e).add(v);
		}
		
		for (int i: map.keySet()) {
			func(map, i);
		}
		
		System.out.println(sj.toString());
	}
}