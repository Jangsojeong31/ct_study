package ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt(); // 총 수
		int top = 0;
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt(); // 현재 입력 받는 수
			if(m > top) {
				for(int j = top + 1; j <= m; j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				top = m;
			}else if(m != stack.peek()) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb.toString());
	}
}
