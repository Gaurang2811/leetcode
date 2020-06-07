package leetcoding.challenge.thirtydays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidParenthesisString {

//	public boolean checkValidString(String s) {
//		int lo = 0, hi = 0;
//		for (char c : s.toCharArray()) {
//			lo += c == '(' ? 1 : -1;
//			hi += c != ')' ? 1 : -1;
//			if (hi < 0)
//				break;
//			lo = Math.max(lo, 0);
//		}
//		return lo == 0;
//	}
	
	
	public boolean checkValidString(String s) {
		List<Integer> lstBrakt = new ArrayList<Integer>();
		List<Integer> lstAstrk = new ArrayList<Integer>();

		for (int i = 0; i < s.toCharArray().length; i++) {
			Character curr = s.toCharArray()[i];
			if (curr.equals(')')) {
				if (lstAstrk.size() == 0 && lstBrakt.size() == 0) {
					return false;
				} else {
					if (lstBrakt.size() > 0) {
						lstBrakt.remove(lstBrakt.size() - 1);
					} else {
						lstAstrk.remove(lstAstrk.size() - 1);
					}
				}
			} else if (curr.equals('*')) {
				lstAstrk.add(i);
			} else {
				lstBrakt.add(i);
			}
		}

		if (lstBrakt.size() == 0) {
			return true;
		} else {
			for (Iterator itrBrakt = lstBrakt.iterator(); itrBrakt.hasNext();) {
				Integer brkt = (Integer) itrBrakt.next();
				for (Iterator itrAstrk = lstAstrk.iterator(); itrAstrk.hasNext();) {
					Integer astrk = (Integer) itrAstrk.next();
					if (astrk > brkt) {
						itrAstrk.remove();
						itrBrakt.remove();
						break;
					}
				}
			}
		}

		if (lstBrakt.size() == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ValidParenthesisString string = new ValidParenthesisString();
		System.out.println(string.checkValidString("(*"));
		System.out.println(string.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
	}

}
