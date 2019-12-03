// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/ladderophilia/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.ladderophillia;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringJoiner sj = new StringJoiner(
				"*   *\n*   *\n",
				"*   *\n*   *\n",
				"*   *\n*   *\n"
		);
		
		for (int i = 0; i < n; i++) {
			sj.add("*****\n");
		}
		
		System.out.println(sj.toString());
	}
}