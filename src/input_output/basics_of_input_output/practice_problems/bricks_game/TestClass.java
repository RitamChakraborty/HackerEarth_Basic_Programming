// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/bricks-game-5140869d/

package input_output.basics_of_input_output.practice_problems.bricks_game;

import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();
        int p = 0, m = 0;
        String result = "";

        while (true) {
            p = i;
            m = i * 2;
            ++i;

            if (p >= n) {
                result = "Patlu";
                break;
            } else {
                n -= p;
            }

            if (m >= n) {
                result = "Motu";
                break;
            } else {
                n -= m;
            }
        }

        System.out.println(result);
    }
}