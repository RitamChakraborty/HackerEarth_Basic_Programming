package input_output.basics_of_input_output.tutorial;

import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String string = sc.next();

        System.out.println(n * 2 + "\n" + string);
    }
}