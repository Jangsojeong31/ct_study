package algorithm_inflearn.section2;

import java.util.Scanner;

public class Array_List_02 {
	// 숫자의 합 구하기 (백준 11720)
	
		/*
		 * 100자릿수의 숫자: String으로 담기 (int, long 불가)
		 * String에서 toChartArray()을 이용하여 문자열을 숫자형으로 변환 -> 아스키코드: 문자 '1'과 숫자 1은 아스키코드 48 차이
		 * ex) '1' - 48 = 1 or '1' - '0' = 1
		 * 
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String sNum = sc.next();
			char[] cNum = sNum.toCharArray();
			int sum = 0;
			for(int i = 0; i < cNum.length; i++) {
				sum += cNum[i] - '0';
			}
			
			System.out.println(sum);
		}
}
