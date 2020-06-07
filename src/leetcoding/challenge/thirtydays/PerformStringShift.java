package leetcoding.challenge.thirtydays;

public class PerformStringShift {
	public String stringShift(String s, int[][] shift) {
		int leftShift = 0;
		int rightShift = 0;
		for (int i = 0; i < shift.length; i++) {
			int[] js = shift[i];
			if (js[0] == 0)
				leftShift += js[1];
			else
				rightShift += js[1];
		}
		int shiftTimes = rightShift - leftShift;
		shiftTimes %= s.length();
		if (shiftTimes > 0) {
			return s.substring(s.length() - shiftTimes, s.length()) + s.substring(0, s.length() - shiftTimes);
		} else if (shiftTimes < 0) {
			shiftTimes *= -1;
			return s.substring(shiftTimes) + s.substring(0, shiftTimes);
		} else {
			return s;
		}
	}

	public static void main(String[] args) {
		PerformStringShift performStringShift = new PerformStringShift();
		int[][] a = { { 0, 7 }, { 1, 7 }, { 1, 0 }, { 1, 3 }, { 0, 3 }, { 0, 6 }, { 1, 2 } };
		System.out.println(performStringShift.stringShift("wpdhhcj", a));
	}
}
