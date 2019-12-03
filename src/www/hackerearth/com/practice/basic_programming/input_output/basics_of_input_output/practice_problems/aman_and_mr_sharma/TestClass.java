// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/aman-mrsharma/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.aman_and_mr_sharma;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < d; ++i) {
			int r = sc.nextInt();
			int x = sc.nextInt();
			
			double cer = 2 * (22.0 / 7.0) * r;
			double dis = 100 * x;
			
			if (dis >= cer) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}