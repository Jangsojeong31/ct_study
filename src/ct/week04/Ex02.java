package ct.week04;
/*
 * 배열로 스택만들기 (숫자, 문자 모두 가능)
 */
public class Ex02 {
	public static void main(String[] args) {
		// 1. push, 2. peek, 3. pop, 4. clear, 5. print, 0. exit
		ArrayStack stack = new ArrayStack(5);
		
	}
}

class ArrayStack{
	private Object stack[];
	private int top;
	private int max;
	
	public ArrayStack(int max) {
		this.max = max;
		this.top = 0;
		this.stack = new Object[max];
	}
	
	public void push(Object obj) {
		if(top <= 0) {
			System.out.println("");
		}
	}
	
	public void peek() {}
	
	public void pop() {}
	
	public void clear() {
		this.top = 0;
		stack = new Object[this.max];
	}
	
}
