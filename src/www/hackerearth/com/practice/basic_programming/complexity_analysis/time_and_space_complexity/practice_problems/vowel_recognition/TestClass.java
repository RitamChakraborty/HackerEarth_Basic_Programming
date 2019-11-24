// https://www.hackerearth.com/practice/basic-programming/complexity-analysis/time-and-space-complexity/practice-problems/algorithm/vowel-game-f1a1047c/

package www.hackerearth.com.practice.basic_programming.complexity_analysis.time_and_space_complexity.practice_problems.vowel_recognition;

import java.util.*;

class TestClass {
    private static long countVowel(String string) {
        char[] chars = string.toCharArray();
        long result = 0;
        int n = chars.length;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                int count = 0;

                for (int k = i; k < j; ++k) {
                    if (
                            chars[k] == 'a' ||
                                    chars[k] == 'e' ||
                                    chars[k] == 'i' ||
                                    chars[k] == 'o' ||
                                    chars[k] == 'u'
                    ) {
                        ++count;
                    }
                }

                result += count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String string = sc.next();
            System.out.println(countVowel(string));
        }
    }
}