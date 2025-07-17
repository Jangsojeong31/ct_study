package ct.week05;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 이진 검색(2)
 */
public class Ex05 {
	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 7, 8, 1, 3, 9, 6};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 숫자 : ");
		int n = sc.nextInt();
		Arrays.sort(arr);
		int idx = Arrays.binarySearch(arr, n);
		if(idx < 0) {
			System.out.println("존재하지 않는 숫자입니다.");
		}else {
			System.out.println(String.format("찾는 숫자 %d는 arr[%d]에 있습니다.", n, idx));
		}
	}
}
