// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/

package input_output.basics_of_input_output.practice_problems.best_index;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		long[] arr = new long[n];
		long s = 0;
		long result = Long.MIN_VALUE;

		for (int i = 0; i < n; ++i) {
			long m = sc.nextLong();
			s += m;
			arr[i] = s;
		}

		for (int i = 0; i < n; ++i) {
			int l = 1;
			long sum = 0;
			int k = i + 1;

			while (k <= n) {
				k += ++l;
			}

			k -= l;

			if (i == 0) {
				sum = arr[k - 1];
			} else {
				sum = arr[k - 1] - arr[i - 1];
			}
			result = Long.max(result, sum);
		}

		System.out.println(result);
	}
}
