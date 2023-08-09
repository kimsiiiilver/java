package sec01;

import java.util.*;

public class 해시맵연습1 {

	public static void main(String[] args) {
		//나라와 인구수를 스캐너를 이용하여 3개 입력 받고
		//예) 한국 5000, 일본 12000, 중국 30000
		//해당 데이터를 해시맵으로 저장한 후
		//사용자가 나라 이름을 입력하면 인구수를 출력하는 코드를 작성하세요
		//사용자가 그만이라고 입력하면 중지
		
		
		
		Map<String, Integer> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.println("3개의 나라와 인구수를 입력하세요.");
		
		for(int i=0; i<3; i++) {
			map.put(s.next(), s.nextInt());
		}
		while(true) {
			System.out.print("나라 이름을 입력해주세요 : ");
			String name=s.next();
			if(name.equals("그만")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			if(map.containsKey(name)) {
				System.out.println("해당 나라의 인구수는 "+map.get(name));
			}else {
				System.out.println("해당 나라가 없어요");
			}
		}
		
	}

}
