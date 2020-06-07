package leetcoding.challenge.thirtydays;

import java.util.Arrays;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {

		for (int times = 0; times < stones.length; times++) {
			for (int i = 0; i < 2; i++) {
				for (int j = i; j < stones.length; j++) {
					if (stones[j] > stones[i]) {
						int tmp = stones[j];
						stones[j] = stones[i];
						stones[i] = tmp;
					}
				}
			}
			if (stones.length > 1) {
				stones[0] = stones[0] - stones[1];
				stones[1] = 0;
			}
		}
		return Arrays.stream(stones).sum();
	}

	public static void main(String[] args) {
		int[] a = { 1};
		LastStoneWeight lsw = new LastStoneWeight();
		System.err.println(lsw.lastStoneWeight(a));
	}

}
