package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.zoos;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] chars = input.toCharArray();

        int zCount = 0, oCount = 0;

        for (char ch: chars) {
            if (ch == 'z') {
                ++zCount;
            } else {
                ++oCount;
            }
        }

        System.out.println(zCount * 2 == oCount ? "Yes" : "No");
    }
}