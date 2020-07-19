// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/char-sum-2d3a6ab5/

package input_output.basics_of_input_output.practice_problems.char_sum;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] chars = input.toCharArray();
        int sum = 0;

        for (char ch : chars) {
            sum += (int) ch - 96;
        }

        System.out.println(sum);
    }
}
