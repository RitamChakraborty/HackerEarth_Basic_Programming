// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/tutorial/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.tutorial;

import java.util.*;

class TestClass {
    public static void main(String[] aregs) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch: chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " " + map.getOrDefault((char) (i + 48), 0));
        }
    }
}