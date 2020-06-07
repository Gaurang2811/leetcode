package leetcoding.challenge.thirtydays;

public class ProductOfArrayExpectSelf {
	public int[] productExceptSelf(int[] nums) {
		int countZero = 0;
		int mult = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				mult *= nums[i];
			} else {
				countZero++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (countZero > 1) {
				nums[i] = 0;
			} else if (countZero == 1) {
				if (nums[i] != 0) {
					nums[i] = 0;
				} else {
					nums[i] = mult;
				}
			} else {
				nums[i] = mult / nums[i];
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 0 , 0};
		ProductOfArrayExpectSelf p = new ProductOfArrayExpectSelf();
		p.productExceptSelf(a);
	}
}
