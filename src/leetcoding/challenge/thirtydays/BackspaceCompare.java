package leetcoding.challenge.thirtydays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class BackspaceCompare {
	public boolean backspaceCompare(String S, String T) {
		return getFinalString(S).equalsIgnoreCase(getFinalString(T)) ? true : false;
	}

	private String getFinalString(String str) {
		LinkedList<String> lstS = new LinkedList<String>(Arrays.asList(str.split("")));
		for (ListIterator<String> itr = lstS.listIterator(); itr.hasNext();) {
			String c = (String) itr.next();
			if ("#".equals(c)) {
				if (itr.previousIndex() != 0) {
					itr.remove();
					itr.previous();
					itr.remove();
				} else {
					itr.remove();
				}
			}
		}
		return lstS.stream().collect(Collectors.joining("")).toString();
	}

	public static void main(String[] args) {
		BackspaceCompare backspaceCompare = new BackspaceCompare();
		System.out.println(backspaceCompare.backspaceCompare("ab#c", "ad#c"));
	}
}
