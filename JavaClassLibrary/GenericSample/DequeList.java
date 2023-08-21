package GenericSample;

import java.util.Deque;
import java.util.LinkedList;

public class DequeList<E> implements Stack<E> {
	private Deque stack;

	public DequeList() {
		stack = new LinkedList<E>();
	}
	@Override
	public void push(E x) {
		stack.add(x);
	}

	@Override
	public E pop() {
		return (E) stack.pop();
	}

}
