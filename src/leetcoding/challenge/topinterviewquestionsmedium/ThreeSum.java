package leetcoding.challenge.topinterviewquestionsmedium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> r = threeSum.threeSum(nums);
		for (List<Integer> list : r) {
			for (Integer list2 : list) {
				System.out.print(list2);
			}
			System.out.println();
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
		if (nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}

		Arrays.sort(nums);
		int pntr1, pntr2, pntr3;

		for (int i = 0; i < nums.length; i++) {
			pntr1 = i;
			pntr2 = pntr1 + 1;
			pntr3 = nums.length - 1;
			while (pntr2 < pntr3) {
				if ((nums[pntr1] + nums[pntr2] + nums[pntr3]) > 0) {
					pntr3--;
				} else if ((nums[pntr1] + nums[pntr2] + nums[pntr3]) < 0) {
					pntr2++;
				} else {
					resultSet.add(Arrays.asList(nums[pntr1], nums[pntr2], nums[pntr3]));
					pntr2++;
				}
			}
		}

		return resultSet.stream().map(el -> new ArrayList<>(el)).collect(Collectors.toList());

	}

//	public List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		if (nums.length < 3) {
//			return result;
//		}
//
//		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			intMap.put(nums[i], intMap.containsKey(nums[i]) ? intMap.get(nums[i]) + 1 : 1);
//		}
//		Set<ArrayList<Integer>> resultSet = new HashSet<ArrayList<Integer>>();
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				int k = 0 - nums[i] - nums[j];
//				boolean usable = false;
//				if (intMap.containsKey(k)) {
//					if (k == nums[i] && k == nums[j]) {
//						if (intMap.get(k) > 2) {
//							usable = true;
//						}
//					} else if (k == nums[i] || k == nums[j]) {
//						if (intMap.get(k) > 1) {
//							usable = true;
//						}
//					} else {
//						usable = true;
//					}
//					if (usable) {
//						ArrayList<Integer> st = new ArrayList<Integer>();
//						st.add(nums[i]);
//						st.add(nums[j]);
//						st.add(0 - nums[i] - nums[j]);
//						st.sort(Comparator.naturalOrder());
//						resultSet.add(st);
//					}
//				}
//			}
//		}
//		for (List<Integer> lsts : resultSet) {
//			result.add(lsts);
//		}
//
//		return result;
//	}
}
