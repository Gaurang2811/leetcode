package leetcoding.challenge.june2020;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		for (int temp = 0; temp < nums.length; temp++) {
			if (nums[temp] == target || nums[temp] > target) {
				return temp;
			}
		}
		return nums.length;
	}

	public static void main(String[] args) {
		SearchInsert s = new SearchInsert();
		int[] n = new int[] { 1, 3, 5, 6 };
		System.out.println(s.searchInsert(n, 5));
	}
}
