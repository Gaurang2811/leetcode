package leetcoding.challenge.thirtydays; 

import java.util.Arrays;
import java.util.Iterator;

public class Solution {
	public boolean checkValidString(String s) {
		int lo = 0, hi = 0;
		for (char c : s.toCharArray()) {
			lo += c == '(' ? 1 : -1;
			hi += c != ')' ? 1 : -1;
			if (hi < 0)
				break;
			lo = Math.max(lo, 0);
		}
		return lo == 0;
	}

	public static void main(String[] args) {
		int a[] = {2100, 1,0, -1, 2,3,10,15};
		for (int temp1 = 0; temp1 < a.length; temp1++) {
			for (int temp2 = temp1; temp2 < a.length; temp2++) {
				if(a[temp1] > a[temp2]) {
					int t = a[temp2];
					a[temp2] = a[temp1];
					a[temp1] = t;
				}
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}