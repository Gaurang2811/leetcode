package leetcoding.challenge.thirtydays;

public class MoreZeros {
	public void moveZeroes(int[] nums) {
		int zeroPointer = 0, nonZeroPointer = 0, temp = 0;
		boolean foundZero = false;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			if (j == 0 && !foundZero) {
				zeroPointer = i;
				foundZero = true;
			} else if (foundZero && zeroPointer < i && j != 0) {
				nonZeroPointer = i;
				temp = nums[zeroPointer];
				nums[zeroPointer] = nums[nonZeroPointer];
				nums[nonZeroPointer] = temp;
				i = zeroPointer - 1;
				foundZero = false;
			}
		}
	}

	public void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + ", ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 0, -1, 0, 1, 0, 4 };
		int a[] = { -2, 0, 0, 0, -2, 1, 5, -3 };
		int b[] = { -2 };
		int c[] = { -2, 0, 1 };
		MoreZeros mz = new MoreZeros();
		mz.moveZeroes(arr);
		mz.moveZeroes(a);
		mz.moveZeroes(b);
		mz.moveZeroes(c);
	}
}
