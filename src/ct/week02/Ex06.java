package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 아이디 비밀번호 찾기 (아이디와 비밀번호가 일치할 때까지)
 * .containsKey(키) / 
 */
public class Ex06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("spring", "1234");
		map.put("summer", "5678");
		map.put("fall", "a1234");
		map.put("winter", "a5678");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			
			if(map.containsKey(id)) { // 존재하는 아이디이면
				if(map.get(id).equals(password)) { // 해당 아이디(키)의 비밀번호(값)이 일치하면 
					System.out.println("로그인에 성공하였습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다. 다시 입력해주세요.");
			}
			
		}
	}
}
