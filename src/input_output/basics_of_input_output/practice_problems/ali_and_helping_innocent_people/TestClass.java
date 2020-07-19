// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

package input_output.basics_of_input_output.practice_problems.ali_and_helping_innocent_people;

import java.util.Scanner;

public class TestClass {
    private static boolean sum(int a, int b) {
        return (a + b) % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char[] chars = string.toCharArray();

        int a = Character.getNumericValue(chars[0]);
        int b = Character.getNumericValue(chars[1]);
        char ch = chars[2];
        int c = Character.getNumericValue(chars[3]);
        int d = Character.getNumericValue(chars[4]);
        int e = Character.getNumericValue(chars[5]);
        char dash = chars[6];
        int f = Character.getNumericValue(chars[7]);
        int g = Character.getNumericValue(chars[8]);

        boolean valid = sum(a, b) && sum(c, d) && sum(d, e) && sum(f, g) && (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'Y');

        System.out.println(valid ? "valid" : "invalid");
    }
}
