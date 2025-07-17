package ct.week01;

import java.util.Arrays;

/*
 * 배열
 */
public class Ex12 {
	public static void main(String[] args) {
		// 선언
		short[] sh;
		int i[]; // 변수 뒤에 []
		
		// 초기화
//		 sh = {1, 2, 3};
		sh = new short[3];
		char[] ch = {'A', 'B', 'C'};
		System.out.println(ch.length); // 배열의 길이: .length // 문자열 길이: .length()
		
		ch[0] = 'a';
//		ch[3] = 'd'; // error: 배열의 길이를 초과함
		
		// 배열 선언 및 초기화 연습
		int a[];
//		a = {1, 2, 3};
		a = new int[] {1, 2, 3};
//		a = new int[2] {1, 2};
		a = new int[4];
//		a = {1, 2, 3, 4};
		a = new int[] {3, 4};
		
		int[] b = new int[3];
//		b = {1, 2, 3};
		b[0] = 1;
		System.out.println(Arrays.toString(b)); // [1, 0, 0]
	}
}
