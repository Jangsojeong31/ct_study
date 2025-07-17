package ct.week02;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList : 중복 o
 * .add(객체) / .toString() / .add(index, 객체) / .set(index, 객체) / .remove(index | 객체) / 
 * .size() / .get(index) / .clear() / .isEmpty() 
 */
public class Ex01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 자동 import: ctrl + shift + o
		
		list.add("Java"); // .add(객체)
		list.add("Spring");
		list.add("MyBatis");
		System.out.println(list.toString()); // [Java, Spring, MyBatis] 
		// .toString()
		
		list.add(2, "Oracle"); // .add(index, 객체)
		list.set(3, "Mybatis"); // .set(index, 객체)
		System.out.println(list.toString()); //[Java, Spring, Oracle, Mybatis]
		
		list.remove(0); // .remove
		System.out.println(list.toString()); //[Spring, Oracle, Mybatis]
		
		list.add("Mybatis");
		list.add("Mybatis");
		System.out.println(list.toString()); //[Spring, Oracle, Mybatis, Mybatis, Mybatis]
		
		list.remove("Mybatis"); // Mybatis 중 가장 앞에 것만 삭제됨
		System.out.println(list.toString()); //[Spring, Oracle, Mybatis, Mybatis]
		
		for(int i = 0; i < list.size(); i++) { // .size()
			System.out.println(list.get(i)); // .get(index i)
		}
		
		list.clear(); // .clear()
		System.out.println(list.isEmpty()); // true
		// .isEmpty()
	}
}
