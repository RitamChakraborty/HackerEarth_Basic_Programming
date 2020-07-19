// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/

package input_output.basics_of_input_output.practice_problems.two_strings;

import java.util.HashMap;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for (char ch : ch1) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }

            for (char ch : ch2) {
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            boolean same = true;

            for (char ch : map1.keySet()) {
                if (map2.containsKey(ch)) {
                    if (map1.get(ch) != map2.get(ch)) {
                        same = false;
                        break;
                    }
                } else {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "YES" : "NO");
        }
    }
}