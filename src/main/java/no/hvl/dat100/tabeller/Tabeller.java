package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String[] stringTabell = new String[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			stringTabell[i] = String.valueOf(tabell[i]);
		}

		return "[" + String.join(",", stringTabell) + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reverser = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reverser[i] = tabell[tabell.length - 1 - i];
		}
		return reverser;
	}


	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i = 0; i < tabell.length; i++) {
			for (int j = i + 1; j < tabell.length; j++) {
				if (tabell[i] > tabell[j]) {
					sortert = false;
					break;
				}
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammen = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sammen[tabell1.length + i] = tabell2[i];
		}
		return sammen;
	}
}
