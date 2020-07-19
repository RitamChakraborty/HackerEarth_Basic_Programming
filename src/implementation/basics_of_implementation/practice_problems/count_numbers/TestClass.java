// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/count-numbers-46/

package implementation.basics_of_implementation.practice_problems.count_numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[] chars = sc.next().toCharArray();
            int count = 0;
            StringBuilder sb = new StringBuilder();
            List<String> list = new ArrayList<>();

            for (int i = 0; i < n; ++i) {
                char ch = chars[i];

                if (Character.isDigit(ch)) {
                    sb.append(ch);
                } else {
                    if (sb.length() != 0) {
                        list.add(sb.toString());
                        ++count;
                        sb = new StringBuilder();
                    }
                }
            }

            if (sb.length() != 0) {
                list.add(sb.toString());
                ++count;
            }

            System.out.println(list);
            System.out.println(count);
        }
    }
}
