// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/i-am-easy/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.i_am_easy;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * n);
		}
	}
}
