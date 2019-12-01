// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/database-0c7cce47/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.database;

import java.math.BigInteger;
import java.util.*;

class TestClass {
    private static class Attribute {
        String name;
        List<String> tuples;
        int maxLength;

        Attribute(String name) {
            this.name = name;
            maxLength = name.length();
            tuples = new ArrayList<>();
        }

        void addTuple(String tuple) {
            tuples.add(tuple);
            maxLength = Integer.max(maxLength, tuple.length());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            List<Attribute> attributes = new ArrayList<>();

            for (int i = 0; i < n; ++i) {
                String attr = sc.next();
                attributes.add(new Attribute(attr));
            }

            for (int j = 0; j < e; ++j) {
                for (int i = 0; i < n; ++i) {
                    String tuple = sc.next();
                    attributes.get(i).addTuple(tuple);
                }
            }

            StringJoiner stringJoiner = new StringJoiner(" | ", "| ", " |");

            for (Attribute attribute: attributes) {
                stringJoiner.add(String.format("%-" + attribute.maxLength + "s", attribute.name));
            }

            StringBuilder cover = new StringBuilder();
            for (char ch: stringJoiner.toString().toCharArray()) {
                if (ch == '|') {
                    cover.append("+");
                } else {
                    cover.append("-");
                }
            }
            StringJoiner sj = new StringJoiner("\n");
            sj.add(cover);
            sj.add(stringJoiner.toString());
            sj.add(cover);

            for (int j = 0; j < e; ++j) {
                StringJoiner stringJoiner1 = new StringJoiner(" | ", "| ", " |");

                for (Attribute attribute: attributes) {
                    String tuple = attribute.tuples.get(j);
                    try {
                        new BigInteger(tuple);
                        stringJoiner1.add(String.format("%" + attribute.maxLength + "s", tuple));
                    } catch (Exception e1) {
                        stringJoiner1.add(String.format("%-" + attribute.maxLength + "s", tuple));
                    }
                }
                sj.add(stringJoiner1.toString());
            }
            sj.add(cover);

            System.out.println(sj.toString());
        }
    }
}
