package ct.week01;
/*
 * 이중 반복문
 */
public class Ex08 {
	public static void main(String[] args) {
		ep:
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) break ep; 
				// break만 있으면: for 반복문만 빠져나감 -> while 반복문은 무한 루프
				// 브레이크 라벨 ep;) ep:가 있는 곳으로 빠져나감 -> while 반복문까지 빠져나감
				System.out.println(i);
			}
		}
	}
}
