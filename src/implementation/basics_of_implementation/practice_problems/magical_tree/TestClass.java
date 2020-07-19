// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/magical-tree/

package implementation.basics_of_implementation.practice_problems.magical_tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            String str = sc.next();
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            List<Character> operations = new ArrayList<>();

            for (char ch : chars) {
                if (Character.isDigit(ch)) {
                    sb.append(ch);
                } else {
                    list.add(Integer.parseInt(sb.toString()));
                    operations.add(ch);
                    sb = new StringBuilder();
                }
            }

            list.add(Integer.parseInt(sb.toString()));

            long total = list.get(0);

            for (int j = 0; j < operations.size(); ++j) {
                total = operations.get(j) == '+'
                        ? total + list.get(j + 1)
                        : total - list.get(j + 1);
            }

            max = Long.max(max, total);
        }

        System.out.println(max);
    }
}
