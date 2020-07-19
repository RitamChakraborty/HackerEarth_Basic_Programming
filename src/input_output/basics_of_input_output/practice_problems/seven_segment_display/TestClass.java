// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/

package input_output.basics_of_input_output.practice_problems.seven_segment_display;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestClass {
    private static int matchNumber(int num) {
        switch (num) {
            case 0:
            case 6:
            case 9:
                return 6;
            case 1:
                return 2;
            case 2:
            case 3:
            case 5:
                return 5;
            case 4:
                return 4;
            case 7:
                return 3;
            case 8:
                return 7;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t = sc.nextInt();
        while (t-- > 0) {
            long count = 0;
            String num = sc.next();
            char[] chars = num.toCharArray();

            for (char ch : chars) {
                count += matchNumber(Character.getNumericValue(ch));
            }

            StringBuilder sb = new StringBuilder();

            if (count % 2 != 0) {
                sb.append("7");
                count -= 3;
            }

            while (count != 0) {
                sb.append("1");
                count -= 2;
            }

            System.out.println(sb.toString());
        }
    }
}