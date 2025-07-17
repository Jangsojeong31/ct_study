package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map: 키, 값 쌍
 * 키는 중복 불가, 값은 중복 가능
 * .put(키, 값) / .size() / .get(키) / .remove / .clear / .isEmpty
 */
public class Ex05 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 90); // .put()
		map.put("이몽룡", 100); 
		map.put("변학도", 90); 
		map.put("홍길동", 95); 
		
		System.out.println(map.size()); // 3
		System.out.println(map.get("홍길동")); // .get(키) // 95
		
		// 모든 '값' 출력하기
		// map의 키를 set으로 변환 후, 키와 값 출력
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.printf("%s, %d\n", key, map.get(key));
		}
//			홍길동, 95
//			변학도, 90
//			이몽룡, 100
		
		map.remove("홍길동");
		map.clear();
	
		System.out.println(map.isEmpty()); // true
	}
}
