package day_17_02_17_SPR;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final String path = "C:\\Users\\komp025\\Desktop\\eclipse\\workspace\\Environment\\src\\";
		
		try {
			
		File f = new File("C:\\Users\\komp025\\Desktop\\eclipse\\workspace\\Environment\\src\\day_17_02_17_SPR\\odp1.txt");
		if(!f.exists()) f.createNewFile();
			
		PrintWriter pw = new PrintWriter(f);
		for(int i=0; i<200; i++){
			if(i%6==0) pw.write(i+"\n");
		}
		pw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ZADANIE 2
		try {
			File f2 = new File(path+"src_SPR_02/liczby.txt");
			
			Scanner sc = new Scanner(f2);
			int[] tab = new int[7];
			for(int i=0; i<7; i++){
				tab[i] = Integer.parseInt(sc.next());
			}
			sc.close();
			int buf;				// SORTOWANIE TABLICY
			for(int i=0; i<6; i++){
				for(int j=0; j<6; j++){
					if(tab[j] > tab[j+1])
					{
						buf = tab[j+1];
						tab[j+1] = tab[j];
						tab[j] = buf;
					}
				}
			}
			
			System.out.println("Minimalna: "+tab[0]);
			System.out.println("Maksymalna: "+tab[tab.length-1]);
			System.out.println("Ró¿nica: "+(tab[tab.length-1]-tab[0]));
			
			//ZADANIE 3
			
			File f3 = new File(path+"src_SPR_02/teksty.txt");
			File f4 = new File(path+"day_17_02_17_SPR/parzyste3.txt");
			File f5 = new File(path+"day_17_02_17_SPR/wyniki3.txt");
			
			Scanner sc2 = new Scanner(f3);
			PrintWriter pw2 = new PrintWriter(f4);
			String[] lines = new String[14];
			
			int aCounter = 0;
			for(int i=0; i<14; i++){
				lines[i] = sc2.nextLine();
				for(int j = 0; j<lines[i].length(); j++){
					if(lines[i].charAt(j) == 'a') aCounter++;
				}
				if (lines[i].length()%2 == 0) pw2.write(lines[i]+"\n");
				
			}
			pw2.close();
			System.out.println("Wszystkich 'a' jest: "+aCounter);
			
			String longest = lines[0];
			String shortest = lines[0];
			for(String line : lines){
				if (line.length() < shortest.length()) shortest = line;
				if (line.length() > longest.length()) longest = line; //DO PRZENIESIENIA DO OSOBNEJ PÊTLI
			}
			sc2.close();
			PrintWriter pw3 = new PrintWriter(f5);
			pw3.print("Najkrótszy: "+shortest);
			pw3.print("Najd³ozszy: "+longest);
			pw3.close();
			
			PrintWriter pw4 = new PrintWriter(f3);
			String buf2 = lines[lines.length-1];
			lines[lines.length-1] = lines[0];
			lines[0] = buf2;
			for(String s : lines){
				pw4.write(s+"\n");
			}
			pw4.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
