package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = ""; // Start with an opening brace and space

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				String b = String.valueOf((matrise[i][j]));
				result += b + " ";
			}
			result += "\n";
		}
        return result;
    }





	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] result = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				result[i][j] = matrise[i][j] * tall;
			}
		}
		return result;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}


		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
