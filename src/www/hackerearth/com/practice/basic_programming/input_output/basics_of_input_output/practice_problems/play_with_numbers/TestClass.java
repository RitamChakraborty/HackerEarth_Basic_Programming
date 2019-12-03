// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/play-with-numbers-2/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.play_with_numbers;

import java.io.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = bufferedReader.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int q = Integer.parseInt(inputs[1]);
		
		long[] arr = new long[n];
		long sum = 0;
		inputs = bufferedReader.readLine().split(" ");
		
		for (int i = 0; i < n; ++i) {
			long m = Long.parseLong(inputs[i]);
			sum += m;
			arr[i] = sum;
		}
		
		while (q-- > 0) {
			inputs = bufferedReader.readLine().split(" ");
			int l = Integer.parseInt(inputs[0]) - 1;
			int r = Integer.parseInt(inputs[1]) - 1;
			
			long total = l == 0 ? arr[r] : arr[r] - arr[l - 1];
			int count = r - l + 1;
			long mean = (int) Math.floor((double) total / (double) count);
			System.out.println(mean);
		}
	}
}