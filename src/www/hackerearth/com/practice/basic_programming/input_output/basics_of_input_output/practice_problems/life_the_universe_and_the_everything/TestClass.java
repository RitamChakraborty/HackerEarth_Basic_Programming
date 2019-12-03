// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.life_the_universe_and_the_everything;

import java.util.*;

class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			
			if (n == 42) {
				break;
			} else {System.out.println(n);}
		}
	}
}