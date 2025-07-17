package ct.week01;
/*
 * 반복문 for(구구단)
 */
public class Ex06 {
	public static void main(String[] args) {
		// 세로형
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// System.out.println(i + " x " + j + " = " + (i*j));
				// System.out.print(i + " x " + j + " = " + (i*j) + "\n");
				System.out.printf("%d x %d = %-2d\n", i, j, (i*j)); // printf: 줄바꿈 x
				// cf) %2d: 숫자를 2자리로 제한 (숫자가 1자리수면 한자리는 띄어쓰기됨: 오른쪽 정렬)
				// cf) %02d: ex) 9 -> 09 
				// cf) %-2d: 왼쪽 정렬
			}
			System.out.println("-----------------------");
		}
		
		// 가로형
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %-2d", j, i, (i*j));
			}
			System.out.println();
		}
		
	}
}
