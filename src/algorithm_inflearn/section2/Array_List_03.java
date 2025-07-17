package algorithm_inflearn.section2;

import java.util.Scanner;

public class Array_List_03 {
// 평균 구하기 (백준 1546) 
	/*
	 * 식을 간단하게 => 총합 * 100 / 최고 점수 / N
	 * 1. 점수를 1차원 배열에 저장
	 * 2. 최고 점수와 총합을 구하기
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		for (int i = 0; i < A.length ; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			sum += A[i];
		}
		
		/*
		 * 배열 생성 없이 바로 하는 방법
		 * for (int i = 0; i < A.length ; i++) {
			int temp = sc.nextInt();
			if(temp > max) max = temp;
			sum += temp;
		}
		 */
		
		System.out.println(sum * 100.0 / max / N);
	}
	
	
}
