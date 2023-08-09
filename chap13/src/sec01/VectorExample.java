package sec01;

import java.util.*;

import javax.swing.border.Border;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();

		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���3"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board bo = list.get(i);
			System.out.println(bo.subject+"\t"+bo.content+"\t"+bo.writer);
		}
		
		for(Board bo2 : list) {
			System.out.println(bo2.subject+"\t"+bo2.content+"\t"+bo2.writer);
		}
	}

}
