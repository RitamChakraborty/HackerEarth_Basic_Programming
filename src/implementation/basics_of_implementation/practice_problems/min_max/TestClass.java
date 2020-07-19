// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/

package implementation.basics_of_implementation.practice_problems.min_max;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        Set<Long> set = new HashSet<>();
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            long m = sc.nextLong();
            min = Long.min(min, m);
            max = Long.max(max, m);
            set.add(m);
        }

        boolean result = true;

        for (long i = min; i <= max; ++i) {
            if (!set.contains(i)) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}
