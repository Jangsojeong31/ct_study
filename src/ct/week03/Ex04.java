package ct.week03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열을 큐로
 */
public class Ex04 {
	public static void main(String[] args) {
		// .add, .poll, .peek, .clear, .print, .exit
		// ArrayQueue 
		ArrayQueue que = new ArrayQueue(5);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1. add, 2. peek, 3. poll, 4. clear, 5. print, 0. exit");
			int n = sc.nextInt();
			if(n == 0) break; // 시스템 종료
			
			switch(n) {
			case 1:
				int m = sc.nextInt();
				que.add(m);
				break;
			case 2:
				System.out.println(que.peek()); 
				break;
			case 3:
				System.out.println(que.poll());
				break;
			case 4:
				que.clear();
				break;
			case 5:
				que.print();
				break;
			default:
				System.out.println("error");
				break;
				
			}
		}
		
	}

}

class ArrayQueue {
	private int[] queue; // 큐
	private int max;   // 최대 용량
	private int front; // 배열 맨앞 커서
	private int rear;  // 배열 맨뒤 커서
	private int cnt;   // 현재 데이터 수
	
	public ArrayQueue(int max) {
		this.max = max;
		this.front = this.rear = this.cnt = 0;
		this.queue = new int[max];
	}
	
	// 메서드
	public void add(int n) {
		if(cnt >= max) {
			System.out.println("Queue is Full!");
		}else {
			// 큐에 담기
			queue[rear++] = n;
			// cnt 증가
			cnt++;
			// rear와 max가 같으면 rear = 0으로 초기화
			if(rear == max) rear = 0;

			System.out.println("입력데이터: " + n); 		
		}
	}
	
	public int peek() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty!");
			return -9999;
		}
		
		return queue[front];
	}
	
	public int poll() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty!");
			return -9999;
		}
		// 개수를 줄인다.
		cnt--;
		if(cnt <= 0) cnt = 0;
		// front와 max가 같으면 front = 0
		if(front >= max) front = 0;
		return queue[front++];
	}
	
	public void clear() { // 초기화
		this.front = this.rear = this.cnt = 0;
		this.queue = new int[max];
	}
	
	public void print() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println(Arrays.toString(queue));
		}
	}
}