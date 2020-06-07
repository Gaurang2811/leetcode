package leetcoding.challenge.thirtydays;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class HappyNumber {

	private boolean isHappy(int num) {
		int sumOfSquares = num;
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(sumOfSquares);
		while (true) {
			sumOfSquares = getSquaresOfSum(sumOfSquares);
			if (sumOfSquares == 1) {
				return true;
			} else if (nums.contains(Integer.valueOf(sumOfSquares))) {
				return false;
			}
			nums.add(sumOfSquares);
		}
	}

	private int getSquaresOfSum(int num) {
		int sumOfSquares = 0;
		while (num > 0) {
			int d = num % 10;
			sumOfSquares += d * d;
			num = num / 10;
		}
		return sumOfSquares;
	}

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		int[] a = IntStream.range(1, 100).toArray();
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			if (hn.isHappy(j))
				System.out.print(j + ", ");
		}
	}

}
