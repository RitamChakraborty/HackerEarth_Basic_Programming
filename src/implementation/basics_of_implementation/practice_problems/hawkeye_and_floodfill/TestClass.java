// FIXME: 12/14/19 
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/hawkeye-and-floodfill/

package implementation.basics_of_implementation.practice_problems.hawkeye_and_floodfill;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p;
        int[][] arr = new int[n][n];

        for (int i = a; i >= 0; --i) {
            arr[i][b] = i;
        }

        p = a;
        for (int i = a; i < n; ++i) {
            arr[i][b] = p > 0 ? p-- : 0;
        }

        for (int i = 0; i < n; ++i) {
            int max = 0;
            int index = 0;

            for (int j = 0; j < n; ++j) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index = j;
                }
            }

            p = max;
            for (int j = index; j >= 0; --j) {
                arr[i][j] = p > 0 ? p-- : 0;
            }

            p = max;
            for (int j = index; j < n; ++j) {
                arr[i][j] = p > 0 ? p-- : 0;
            }
        }

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < n; ++i) {
            sb.append("\n");
            for (int j = 0; j < n; ++j) {
                sb.append(arr[i][j]).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}