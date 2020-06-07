package leetcoding.challenge.thirtydays;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
	public int countElements(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i] - 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(Integer.valueOf(arr[i]))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 1, 3, 3, 5, 5, 7, 7 };
		int[] c = { 1, 3, 2, 3, 5, 0 };
		int[] d = { 1, 1, 2, 2 };
		CountingElements elements = new CountingElements();
		System.err.println(elements.countElements(a));
		System.err.println(elements.countElements(b));
		System.err.println(elements.countElements(c));
		System.err.println(elements.countElements(d));
	}
}
