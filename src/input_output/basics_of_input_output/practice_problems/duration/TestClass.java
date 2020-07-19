// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/duration/

package input_output.basics_of_input_output.practice_problems.duration;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int startingHour = sc.nextInt();
            int startingMinute = sc.nextInt();
            int endingHour = sc.nextInt();
            int endingMinute = sc.nextInt();

            if (endingMinute < startingMinute) {
                endingMinute += 60;
                endingHour--;
            }

            int workHour = endingHour - startingHour;
            int workMinute = endingMinute - startingMinute;

            System.out.println(workHour + " " + workMinute);
        }
    }
}
