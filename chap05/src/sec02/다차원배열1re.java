package sec02;

public class 다차원배열1re {

	public static void main(String[] args) {

		int[][] koreanScores = { { 85, 93 }, { 72, 91, 88 }, { 66 }, { 55, 57, 99 } };

		for (int j = 0; j < koreanScores.length; j++) {
			for (int t = 0; t < koreanScores[j].length; t++) {
				System.out.println("koreanScores[" + j + "][" + t + "]=" + koreanScores[j][t]);

			}
		}
	}
}
