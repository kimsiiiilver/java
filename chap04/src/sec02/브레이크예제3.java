package sec02;


public class 브레이크예제3 {

	public static void main(String[] args) {

		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper +"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}

	}
}
