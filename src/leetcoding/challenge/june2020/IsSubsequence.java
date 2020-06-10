package leetcoding.challenge.june2020;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int temp = 0;
		for (char sChar : s.toCharArray()) {
			boolean found = false;
			for (; temp < t.toCharArray().length; temp++) {
				System.out.println(sChar + "==" + t.charAt(temp));
				if (sChar == t.charAt(temp)) {
					found = true;
					temp++;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsSubsequence s = new IsSubsequence();
		System.out.println(s.isSubsequence("abc", "ahbgdc"));
	}
}
