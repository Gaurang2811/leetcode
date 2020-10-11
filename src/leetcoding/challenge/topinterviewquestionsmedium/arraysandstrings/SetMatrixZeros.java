package leetcoding.challenge.topinterviewquestionsmedium.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ga.omar
 *
 * @see <a href=
 *      "https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/778/">Question
 *      Link</a>
 */
public class SetMatrixZeros {

	public static void main(String[] args) {
		SetMatrixZeros matrixZeros = new SetMatrixZeros();
		int[][] nums = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		matrixZeros.setZeroes(nums);
		for (int[] is : nums) {
			for (int i : is) {
				System.out.print(i);
			}
			System.err.println();
		}
	}

	public void setZeroes(int[][] matrix) {
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> cols = new ArrayList<Integer>();

		for (int i = 0; i < matrix.length; i++) {
			int[] arr = matrix[i];
			for (int j = 0; j < arr.length; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for (Integer col : cols) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][col] = 0;
			}
		}
		for (Integer row : rows) {
			int[] arr = matrix[row];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = 0;
			}
		}
	}

}
