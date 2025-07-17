package ct.week03;

import java.util.PriorityQueue;

/*
 * PriorityQueue(우선순위 큐) : 우선 순위대로
 * 이진트리 원리 
 */
public class Ex03 {
	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.offer(3);
		que.offer(5);
		que.offer(2);
		que.offer(1);
		que.offer(8);
		que.offer(4);
		System.out.println(que.toString()); // [1, 2, 3, 5, 8, 4]
		
	}
}
