package ct.week01;

public class Ex09 {
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) continue; // 위의 반복문 시작점으로 올라감
			System.out.println(i);
		}
	}
}
