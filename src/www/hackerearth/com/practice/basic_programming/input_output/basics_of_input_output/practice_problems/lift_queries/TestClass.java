// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/lift-queries/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.lift_queries;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 7;

        while (t-- > 0) {
            int n = sc.nextInt();
            int aDiff = Math.abs(n - a);
            int bDiff = Math.abs(n - b);

            if (aDiff < bDiff) {
                a = n;
                System.out.println("A");
            } else if (aDiff > bDiff) {
                b = n;
                System.out.println("B");
            } else {
                if (a < n) {
                    a = n;
                    System.out.println("A");
                } else {
                    b = n;
                    System.out.println("B");
                }
            }
        }
    }
}