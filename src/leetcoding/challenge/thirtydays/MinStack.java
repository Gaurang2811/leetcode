package leetcoding.challenge.thirtydays;

import java.util.LinkedList;

class MinStack {

	private LinkedList<Integer> stack = null;
	private int size = 0;

	public MinStack() {
		stack = new LinkedList<Integer>();
	}

	public void push(int x) {
		stack.add(x);
		size++;
	}

	public void pop() {
		if (size > 0)
			stack.remove(--size);
	}

	public int top() {
		return size > 0 ? stack.get(size-1) : 0;
	}

	public int getMin() {
		return stack.stream().min(Integer::compare).orElse(0);
	}

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(3);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
	}
}