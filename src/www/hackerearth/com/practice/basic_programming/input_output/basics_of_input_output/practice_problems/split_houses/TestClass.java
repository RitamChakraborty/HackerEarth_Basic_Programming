// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.split_houses;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next();
        char[] chars = input.toCharArray();
        boolean bool = true;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '.') {
                chars[i] = 'B';
            } else if (i < n - 1 && chars[i] == 'H' && chars[i + 1] == 'H') {
                bool = false;
                break;
            }
        }

        if (bool) {
            System.out.println("YES");
            for (char ch: chars) {
                System.out.print(ch);
            }
        }  else {
            System.out.println("NO");
        }
    }
}