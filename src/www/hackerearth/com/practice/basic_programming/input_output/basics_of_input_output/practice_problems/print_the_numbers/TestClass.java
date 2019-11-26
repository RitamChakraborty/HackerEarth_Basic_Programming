// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/print-the-numbers/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.print_the_numbers;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringJoiner sj = new StringJoiner(" ");

        while (n-- > 0) {
            String num = sc.next();
            sj.add(num);
        }

        System.out.println(sj.toString());
    }
}