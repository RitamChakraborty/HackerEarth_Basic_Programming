// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/

package input_output.basics_of_input_output.practice_problems.friends_relationship;

import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }

                for (int j = 0; j < (n - (i + 1)) * 2; j++) {
                    sb.append("#");
                }

                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }

                sb.append("\n");
            }

            System.out.println(sb.toString());
        }
    }
}