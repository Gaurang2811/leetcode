package leetcoding.challenge.thirtydays;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {

		int max = nums[0];
		int maxSumTillNow = 0, start = 0, end = 0;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			maxSumTillNow += j;
			if (maxSumTillNow < nums[i]) {
				maxSumTillNow = nums[i];
				start = i + 1;
			}
			if (max < maxSumTillNow) {
				max = maxSumTillNow;
				end = i;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int b[] = { -2};
		int c[] = { -2, -1, 1};
		MaximumSubarray ms = new MaximumSubarray();
		System.err.println(ms.maxSubArray(arr));
		System.err.println(ms.maxSubArray(a));
		System.err.println(ms.maxSubArray(b));
		System.err.println(ms.maxSubArray(c));
	}
}
