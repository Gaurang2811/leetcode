package leetcoding.challenge.thirtydays;

public class ContigiousArray {
	public int findMaxLength(int[] nums) {
		int currValue = nums[0];
		int maxLength = 0;
		int currZerosCount = 0;
		int currOnesCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				currZerosCount++;
			} else if (nums[i] == 1) {
				currOnesCount++;
			}
			if (currValue != nums[i] || i == nums.length - 1) {
				int tmp = Math.min(currOnesCount, currZerosCount);
				maxLength = Math.max(tmp * 2, maxLength);
				currValue = nums[i];
				if (currValue == 1) {
					currOnesCount = 0;
				} else if (currValue == 0) {
					currZerosCount = 0;
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1 };
		ContigiousArray array = new ContigiousArray();
		System.out.println(array.findMaxLength(arr));
	}
}
