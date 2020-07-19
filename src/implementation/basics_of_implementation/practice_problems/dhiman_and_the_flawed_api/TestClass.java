// https://www.hackerearth.com/practice/algorithms/string-algorithm/string-searching/practice-problems/algorithm/dhiman-and-the-flawed-api/

package implementation.basics_of_implementation.practice_problems.dhiman_and_the_flawed_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();

		while (t-- > 0) {
			String input = sc.next();
			char[] chars = input.toCharArray();
			boolean valid = true;
			int n = chars.length;

			if (n > 1) {
				int first = Character.getNumericValue(chars[0]);
				int second = Character.getNumericValue(chars[1]);
				int index = 2;

				if (first == 0) {
					if (second != 1) {
						valid = false;
					}
				} else if (first == 1) {
					if (second != 1 && second != 2) {
						valid = false;
					}
				} else if (first == 2) {
					if (second != 3) {
						valid = false;
					}
				} else if (first == 3) {
					if (second != 5) {
						valid = false;
					}
				} else if (first == 5) {
					if (second != 8) {
						valid = false;
					}
				} else if (first == 8) {
					second = Integer.parseInt(String.valueOf(chars[1]) + chars[2]);
					index = 3;

					if (second != 13) {
						valid = false;
					}
				}

				if (valid && n > 2) {
					long a = first;
					long b = second;
					long c = a + b;
					StringBuilder sb = new StringBuilder();

					for (int i = index; i < n; i++) {
						sb.append(chars[i]);
						long temp = Long.parseLong(sb.toString());

						if (temp == c) {
							a = b;
							b = c;
							c = a + b;
							sb = new StringBuilder();
						} else if (temp > c) {
							valid = false;
							break;
						} else {
							if (i == n - 1) {
								valid = false;
							}
						}
					}
				}
			}

			System.out.println(valid ? "Valid" : "Invalid");
		}
	}
}
