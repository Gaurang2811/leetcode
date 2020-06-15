package leetcoding.challenge.june2020;

public class SearchInBST {
	public TreeNode searchBST(TreeNode root, int val) {
		if (null == root) {
			return null;
		}
		if (root.val == val) {
			return root;
		} else {
			if (root.val < val) {
				return searchBST(root.right, val);
			} else {
				return searchBST(root.left, val);
			}
		}
	}

	/** Definition for a binary tree node. */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}