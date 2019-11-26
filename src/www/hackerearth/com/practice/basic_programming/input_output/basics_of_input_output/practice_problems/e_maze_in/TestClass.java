// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.e_maze_in;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] directions = input.toCharArray();
        int x = 0;
        int y = 0;

        for (char direction: directions) {
            if (direction == 'L') {
                --x;
            } if (direction == 'R') {
                ++x;
            } if (direction == 'U') {
                ++y;
            } if (direction == 'D') {
                --y;
            }
        }

        System.out.println(x + " " + y);
    }
}
