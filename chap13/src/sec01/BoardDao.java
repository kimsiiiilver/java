package sec01;

import java.util.*;


public class BoardDao {
	
	public List<Boardr2>getBoardr2List(){
		List<Boardr2> list = new ArrayList<>();
		list.add(new Boardr2("����1", "����1"));
		list.add(new Boardr2("����2", "����2"));
		list.add(new Boardr2("����3", "����3"));
		return list;
	}

	
}
