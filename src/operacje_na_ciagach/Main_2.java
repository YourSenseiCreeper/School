package operacje_na_ciagach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		//Zapisywanie odpowiedzi do osobnego pliku tekstowego
		//Odpowiedzi jest 210
		File f = new File("C:\\Users\\komp025\\Desktop\\eclipse\\workspace\\Environment\\src\\cyfry.txt");
		
		Scanner sc;
		int[] cyfry = new int[1000];
		int[] sumy = new int[1000];
		
		try {
			sc = new Scanner(f);
		
		System.out.println(sc.next());
		
		/** Zliczanie sumy cyfr z liczby
		int liczba = 41231;
		int wynik = 0;
			while(liczba!=0){
				wynik += liczba%10;
				liczba = liczba / 10;
			}
		*/
		
		String buf = "";
		int suma = 0;
		int one = 0;
		for (int i = 0; i < 999; i++) {
			buf = sc.next();
			suma = 0;
			for(int j = 0; j < buf.length(); j++){
				one = Integer.parseInt(buf.charAt(j)+"");
				suma += one;
			}
			cyfry[i] = Integer.parseInt(buf);
			sumy[i] = suma;
		}
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < 999; i++){
			System.out.println("Liczba: "+cyfry[i]+" suma cyfr: "+sumy[i]);
		}

		

	}

}
