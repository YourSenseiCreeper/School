package monotonicznosc_ciagow;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		PrintWriter out = null;

		File f = new File("liczby.txt");
		try {
			if(!f.exists()){
				f.createNewFile();
			}
			out = new PrintWriter("liczby.txt");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//GENEROWANIE ELEMENTÓW CI¥GU
		Random r = new Random();
		
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				out.append(r.nextInt(30)+" ");
			}
			if (i!=4) out.append("\n");
		}
		
		out.close();
		System.out.println("Koniec losowania liczb.");
		System.out.println("========================");
		
		BufferedWriter out2 = new BufferedWriter(new FileWriter("liczby.txt", true)); //DOPISYWANIE DO PLIKU
		
		out2.append("\n");
		out2.write("1 2 3 4 5\n");
		out2.write("5 4 3 2 1");
		out2.close();
		
		System.out.println("Koniec dopisywania liczb.");
		System.out.println("========================");
		
		//PORÓWNYWANI CI¥GÓW
		
		Scanner sc = new Scanner("liczby.txt");
		
		int a = 0;
		int b = 0;
		while(sc.hasNextLine()){
			for(int i = 0; i<sc.next().split(" ").length; i++){
				
			}
		}
			
	}

}
