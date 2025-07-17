package ct.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList / LinkedList
 */
public class Ex03 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime;
		long endTime;
		
		// ArrayList 시간 측정
		startTime = System.nanoTime(); // 현재의 시간(시,분,초)를 timestamp로 변환 후 반환
		for(int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i)); // String.valueOf: int i를 문자열로 변환
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList: " + (endTime - startTime) + " ns");
		
		// LinkedList 시간 측정
		startTime = System.nanoTime(); // 현재의 시간(시,분,초)를 timestamp로 변환 후 반환
		for(int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i)); // String.valueOf: int i를 문자열로 변환
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList: " + (endTime - startTime) + " ns"); 
		
		
//		ArrayList: 2268755000 ns
//		LinkedList: 73591800 ns
			
	}
}
