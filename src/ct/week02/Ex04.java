package ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set: 중복 x
 * .get() 메서드 없음
 */
public class Ex04 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Spring");
		set.add("Oracle");
		set.add("Java");
		set.add("Mybatis");
		set.add("Java");
		
		System.out.println(set.toString()); // [Java, Spring, Oracle, Mybatis]
		
		// 요소 출력 방법 1
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {// 다음 요소의 존재 유무 확인
			System.out.println(iterator.next());
		}	
		
		// 요소 출력 방법 2
		for(String s: set) {
			System.out.println(s);
		}
	}

}
