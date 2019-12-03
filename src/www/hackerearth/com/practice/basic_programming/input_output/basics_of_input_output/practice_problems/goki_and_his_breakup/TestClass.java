// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/tds-and-his-breakup/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.goki_and_his_breakup;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		while (n-- > 0) {
			int y = sc.nextInt();
			System.out.println(y >= x ? "YES" : "NO");
		}
	}
}