package operacje_na_ciagach;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Zapisywanie odpowiedzi do osobnego pliku tekstowego
		//Odpowiedzi jest 210
		
		Scanner sc = new Scanner("liczby.txt");
		int[] liczby = new int[510];
		int[] sumy = new int[70];
		
		for (int i = 0; i < 510; i++) {
			liczby[i] = sc.nextInt();
		}

		// Przeszukiwanie tablicy
		for (int i = 0; i < 509; i++) {
			sumy[i] = liczby[i] + liczby[i + 1];
		}

		sc.close();

	}

}
