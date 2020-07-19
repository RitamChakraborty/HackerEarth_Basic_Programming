// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/doctors-secret/

package input_output.basics_of_input_output.practice_problems.doctors_secret;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int pages = sc.nextInt();

        System.out.println(
                len <= 23 && pages >= 500 && pages <= 1000
                        ? "Take Medicine"
                        : "Don't take Medicine"
        );
    }
}