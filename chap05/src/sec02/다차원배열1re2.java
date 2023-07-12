package sec02;

public class 다차원배열1re2 {

	public static void main(String[] args) {

		int[][] englishScores = new int[2][0];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		int[][] koreanScores = new int[4][0];
		koreanScores[0] = new int[2];
		koreanScores[1] = new int[3];
		koreanScores[2] = new int[1];
		koreanScores[3] = new int[3];
		
		for (int j=0; j<koreanScores.length; j++) {
			for (int t=0; t<koreanScores[j].length; t++) {
				System.out.println("koreanScores["+j+"]["+t+"]="+koreanScores[j][t]);
				
			}
		}
	}
}
