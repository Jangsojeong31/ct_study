package ct.week02;

import java.util.List;
import java.util.Vector;

/*
 * Vector
 * .add() / .size() / .get()
 */

public class Ex02 {
	public static void main(String[] args) { 
		List<Board> list = new Vector<>();
		Board board = new Board();
		board.setNo(1);
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("작성자1");
		
		list.add(board);
		list.add(new Board(2, "제목2", "내용2", "작성자2"));
		list.add(new Board(3, "제목3", "내용3", "작성자3"));
		list.add(new Board(4, "제목4", "내용4", "작성자4"));
		
		System.out.println(list.size()); // 4
		
		for(int i = 0; i < list.size(); i++) {
			Board board1 = list.get(i);
			int no = board1.getNo();
			String title = board1.getTitle();
			String content = board1.getContent();
			String writer = board1.getWriter();
			System.out.printf("%d %s %s %s\n", no, title, content, writer);
		}
	}
}
