// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.digit_problem;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int k = sc.nextInt();
        char[] chars = input.toCharArray();

        for (int i = 0; k > 0 && i < chars.length; ++i) {
            if (chars[i] != '9') {
                chars[i] = '9';
                --k;
            }
        }

        for (char ch: chars) {
            System.out.print(ch);
        }
    }
}