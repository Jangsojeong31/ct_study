package ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // import 필요 x
//		StringBuffer sb1 = new StringBuffer();
//		StringTokenizer st = new StringTokenizer("");
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String cmd = s.split(" ")[0]; // 명령어만 뽑아냄
			switch(cmd) {
			case "push": // push는 출력 필요 x
				stack.push(Integer.parseInt(s.split(" ")[1]));
				break;
			case "pop":
				if(stack.isEmpty()) sb.append(-1).append("\n");
				else sb.append(stack.pop()).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty": // 삼항 연산자로도 가능
				if(stack.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "top":
				if(stack.isEmpty()) sb.append(-1).append("\n");
				else sb.append(stack.peek()).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
		
	}
}
