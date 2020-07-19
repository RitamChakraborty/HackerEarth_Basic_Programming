// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/database-0c7cce47/
// FIXME: 12/4/19 
package input_output.basics_of_input_output.practice_problems.database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-- > 0) {
            String[] inputs = bf.readLine().split(" ");

            int n = Integer.parseInt(inputs[0]);
            int e = Integer.parseInt(inputs[1]);
            List<Attribute> attributes = new ArrayList<>();

            inputs = bf.readLine().split(" ");

            for (int i = 0; i < n; ++i) {
                String attr = inputs[i];
                attributes.add(new Attribute(attr));
            }

            for (int j = 0; j < e; ++j) {
                inputs = bf.readLine().split(" ");
                for (int i = 0; i < n; ++i) {
                    String tuple = inputs[i];
                    attributes.get(i).addTuple(tuple);
                }
            }

            StringJoiner stringJoiner = new StringJoiner(" | ", "| ", " |");

            for (Attribute attribute : attributes) {
                stringJoiner.add(String.format("%-" + attribute.maxLength + "s", attribute.name));
            }

            StringBuilder cover = new StringBuilder();

            for (char ch : stringJoiner.toString().toCharArray()) {
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

                for (Attribute attribute : attributes) {
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
}
