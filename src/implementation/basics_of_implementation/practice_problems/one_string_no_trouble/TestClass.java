// FIXME: 12/14/19 
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/one-string-no-trouble-37037871/

package implementation.basics_of_implementation.practice_problems.one_string_no_trouble;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char[] chars = sc.next().toCharArray();
        int n = chars.length;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            ++count;

            if (i != n - 1 && chars[i] == chars[i + 1]) {
                max = Integer.max(max, count);
                count = 0;
            }
        }

        System.out.println(max == Integer.MIN_VALUE ? n : max);
    }
}