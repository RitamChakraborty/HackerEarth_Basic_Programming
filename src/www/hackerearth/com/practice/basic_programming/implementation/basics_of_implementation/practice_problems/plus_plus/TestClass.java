// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/plus-plus-60bcac48/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.plus_plus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
	private static class Position {
		int i;
		int j;
		int value;
		
		private Position(int i, int j, int value) {
			this.i = i;
			this.j = j;
			this.value = value;
		}
		
		@Override
		public boolean equals(Object o) {
			return o instanceof Position && (this.i == ((Position) o).i && this.j == ((Position) o).j);
		}
		
		@Override
		public String toString() {
			return "(" + i + ", " + j + "): " + value;
		}
	}
	
	private static class Plus {
		Position middle;
		Position left;
		Position right;
		Position top;
		Position bottom;
		
		private Plus(Position middle, Position left, Position right, Position top, Position bottom) {
			this.middle = middle;
			this.left = left;
			this.right = right;
			this.top = top;
			this.bottom = bottom;
		}
		
		@Override
		public String toString() {
			return "\n          " + top +
					       "\n" + left + " " + middle + " " + right +
					       "\n          " + bottom +
					       "\n----------";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		List<Plus> pluses = new ArrayList<>();
		
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < m - 1; ++i) {
			for (int j = 1; j < n - 1; ++j) {
				pluses.add(new Plus(
						new Position(i, j, arr[i][j]),
						new Position(i, j - 1, arr[i][j - 1]),
						new Position(i, j + 1, arr[i][j + 1]),
						new Position(i - 1, j, arr[i - 1][j]),
						new Position(i + 1, j, arr[i + 1][j])
				));
			}
		}

//		System.out.println(pluses);
		
		long max = Long.MIN_VALUE;
		for (int i = 0; i < pluses.size(); ++i) {
			for (int j = i + 1; j < pluses.size(); ++j) {
				Plus plus1 = pluses.get(i);
				Plus plus2 = pluses.get(j);
				
				if (
						!plus1.right.equals(plus2.left) &&
								!plus1.right.equals(plus2.middle) &&
								!plus1.middle.equals(plus2.top) &&
								!plus1.left.equals(plus2.top) &&
								!plus1.bottom.equals(plus2.top) &&
								!plus1.right.equals(plus2.top)
				) {
					max = Long.max(
							max,
							plus1.middle.value * plus2.middle.value +
									plus1.left.value * plus2.left.value +
									plus1.top.value * plus2.top.value +
									plus1.right.value * plus2.right.value +
									plus1.bottom.value * plus2.bottom.value
					);
				}
			}
		}
		
		System.out.println(max);
	}
}
