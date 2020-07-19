// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/sum-it-if-you-can-4867f851/

package input_output.basics_of_input_output.practice_problems.book_of_portion_making;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char[] chars = number.toCharArray();

        int i = 0;
        int sum = 0;
        for (char ch : chars) {
            int num = Character.getNumericValue(ch);
            sum += ++i * num;
        }

        System.out.println(sum % 11 == 0 ? "Legal ISBN" : "Illegal ISBN");
    }
}
