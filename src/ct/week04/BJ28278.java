package ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ28278 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int cmd = Integer.parseInt(s.split(" ")[0]);
			switch(cmd) {
			case 1:
				stack.push(Integer.parseInt(s.split(" ")[1]));
				break;
			case 2:
				if(stack.isEmpty()) sb.append(-1).append("\n");
				else sb.append(stack.pop()).append("\n");
				break;
			case 3:
				sb.append(stack.size()).append("\n");
				break;
			case 4:
				if(stack.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case 5:
				if(stack.isEmpty()) sb.append(1).append("\n");
				else sb.append(stack.peek()).append("\n");
				break;
			}
		}
		
		System.out.println(sb.toString());
	}

}
