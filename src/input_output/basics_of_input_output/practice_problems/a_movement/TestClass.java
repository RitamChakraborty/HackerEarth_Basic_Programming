// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/a-movement-1/

package input_output.basics_of_input_output.practice_problems.a_movement;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 5 == 0 ? n / 5 : n / 5 + 1);
    }
}