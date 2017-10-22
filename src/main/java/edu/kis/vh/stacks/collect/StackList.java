package edu.kis.vh.stacks.collect;

import edu.kis.vh.stacks.stackable;

public class StackList implements stackable{

	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return 0;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return 0;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}