// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/array-insert/

package implementation.basics_of_implementation.practice_problems.array_insert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    private static void update(long[] arr, long num, int index) {
        arr[index] = num;
    }

    private static void printSum(long[] arr, int left, int right) {
        long sum = 0;

        for (int i = left; i <= right; ++i) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; ++i) {
            long m = sc.nextLong();
            arr[i] = m;
        }

        while (q-- > 0) {
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    int index = sc.nextInt();
                    long num = sc.nextLong();
                    update(arr, num, index);
                    break;
                case 2:
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    printSum(arr, left, right);
                    break;
                default:
            }
        }
    }
}