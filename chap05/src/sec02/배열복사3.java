package sec02;

public class 배열복사3 {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);

		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]);
			if(i!=newIntArray.length-1) {
				System.out.print(", ");
			}
		}
	}

}
