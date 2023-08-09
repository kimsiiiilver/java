package sec01;

import java.util.*;


public class BoardDao {
	
	public List<Boardr2>getBoardr2List(){
		List<Boardr2> list = new ArrayList<>();
		list.add(new Boardr2("力格1", "郴侩1"));
		list.add(new Boardr2("力格2", "郴侩2"));
		list.add(new Boardr2("力格3", "郴侩3"));
		return list;
	}

	
}
