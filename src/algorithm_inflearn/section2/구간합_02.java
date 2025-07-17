package algorithm_inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 10만 이상의 수를 다룰때
 * - BufferReader
 * - StringTokenizer
 */
public class 구간합_02 {
	public static void main(String[] args) throws IOException{
		// 백준 11659
		// 1. N개의 수를 입력받음과 동시에 합 배열을 생성
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in)); // 10만 이상의 수를 입력받을 때 (빠른 속도)
		
		StringTokenizer stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		long[] S = new long[suNo + 1]; // 합배열 선언 (인덱스 0무시를 위해 +1)
		
		stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
		for(int i = 1; i <= suNo; i++) {
			// 합 배열 생성
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// 2. 구간이 주어지면 구간 합 공식으로 정답 출력
		for(int q = 0; q<quizNo; q++) {
			stringTokenizer =
					new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
	}
	
	

}
