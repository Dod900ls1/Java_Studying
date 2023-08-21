package GenericSample;

import java.util.Deque;

public class GenericsApp {
	
	public static void main(String[] agrs) {
		Stack<Integer> ints = new DequeList<>();
		Stack<String> strings = new DequeList<>();
		
		if(ints.getClass() == strings.getClass())
			System.out.printf("Stack<Integer> and Stack<String> are both %s!\n", ints.getClass());
		strings.push("yay");
		strings.push("not");
		strings.push("not2");
		strings.push("not23");
		strings.push("not4");
		ints.push(1);
		ints.push(2);
		
		
	}
}
