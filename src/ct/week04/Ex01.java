package ct.week04;

/*
 * Stack: LIFO
 */
import java.util.Stack;

public class Ex01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.add(2);
		System.out.println(stack.toString()); // [1, 2]
		stack.add(0, 0); // (index, 값)
		System.out.println(stack.toString()); // [0, 1, 2]
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek()); // 2 (가져오기만)
		System.out.println(stack.get(1)); // 1
		System.out.println(stack.pop()); // 2 (가져오고 제거)
//		System.out.println(stack.getFirst());
		
	}
}
