package ct.week01;
/*
 * 연산자
 */
public class Ex03 {

	public static void main(String[] args) {
		int i = 1, j = 2;
		
		int a = i + j;
		int b = i - j;
		int c = i * j;
		int d = i / j; // 0 	cf) double d = i / j 인 경우: 0.500000 (소수점 아래 6자리) 
		int e = i % j; // 1
		System.out.println(a);
		
		// 비트연산
		System.out.println(1&2);
		System.out.println(1|2);
	}
	
	
	
	
}
