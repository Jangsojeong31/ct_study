package ct.week03;
/*
 * Deque
 */

import java.util.Deque;
import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
		Deque<Integer> que = new LinkedList<>();
		que.add(1);
		que.add(2);
		que.offer(3);
		System.out.println(que.toString()); // [1, 2, 3]
		que.addFirst(0);
		System.out.println(que.toString()); // [0, 1, 2, 3]
		System.out.println(que.peek()); // 0

	}
}
