package ct.week01;
/*
 * 문자열
 */
public class Ex10 {
	public static void main(String[] args) {
		String s = "Good Morning";
		System.out.println("charAt : " + s.charAt(7)); // r
		System.out.println("startsWith : " + s.startsWith("good")); // 대소문자 구분 o // false
		System.out.println("endsWith : " + s.endsWith("good"));
		System.out.println("equals : " + s.equals("good morning"));
		
		System.out.println("indexOf : " + s.indexOf("Mor"));
		System.out.println("indexOf : " + s.indexOf("n")); // 8
		System.out.println("lastIndexOf : " + s.lastIndexOf("n")); // 10
		// indexOf: 앞에서부터 찾음, 없으면 -1 반환
		// lastIndexOf: 뒤에서부터 찾음
		
		System.out.println("length : " + s.length());
		
		System.out.println("replace : " + s.replace("Good", "a")); // replace : a Morning
		System.out.println("replace : " + s.replace("o", "a")); // replace : Gaad Marning
		System.out.println("replaceFirst : " + s.replaceFirst("o", "a")); // replaceFirst : Gaod Morning
		System.out.println("replace : " + s.replace("[Good]", "a")); // replace : Good Morning
		
		System.out.println("replaceAll : " + s.replaceAll("Good", "a")); // replaceAll : a Morning
		System.out.println("replaceAll : " + s.replaceAll("[Good]", "a")); // replaceAll : aaaa Marning
		System.out.println("replaceAll : " + s.replaceAll("[^G]", "a")); // replaceAll : Gaaaaaaaaaaa
																		// G가 아닌 것들을 a로 바꾸기: ^ 는 not의 의미
		System.out.println("replaceAll : " + s.replaceAll("^[G]", "a")); // replaceAll : aood Morning
		System.out.println("replaceAll : " + s.replaceAll("[G]$", "a")); // replaceAll : Good Morning
		
	}
}
