package ct.week03;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue : FIFO
 * .remove(객체)
 */

public class Ex01 {
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		
		que.add(1); // 성공 -> true / 실패 -> exception
		que.add(2);
		que.offer(3); // 성공 -> true / 실패 -> false
		que.offer(4);
		System.out.println(que.toString());  // [1, 2, 3, 4]
		System.out.println(que.peek()); // 제거하지 않고 가져오기
		// 1
		System.out.println(que.toString());  // [1, 2, 3, 4]
		
		que.poll(); // 가장 앞 요소를 제거하기
		System.out.println(que.toString());  // [2, 3, 4]
		
		System.out.println(que.size()); // 3
		System.out.println(que.isEmpty()); // false
		System.out.println(que.remove(4)); // 성공 -> true / 실패 -> false
		System.out.println(que.toString()); // [2, 3]
		que.clear();
		System.out.println(que.toString());
		
	}

}
