package day_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static List<String> rzecz = new ArrayList<>();
	static List<String> czas = new ArrayList<>();
	static List<String> przym = new ArrayList<>();
	
	static String FOLDER = "C:\\Users\\komp025\\Desktop\\eclipse\\workspace\\Environment\\src\\day_3\\Wyrazy\\";
	static String RZECZ_LOC = FOLDER+"rzeczowniki.txt";
	static String CZAS_LOC = FOLDER+"czasowniki.txt";
	static String PRZYM_LOC = FOLDER+"przymiotniki.txt";
	
	static String pattern = "prcpr";

	public static void main(String[] args) {
		
		load(RZECZ_LOC, rzecz, "rzeczowników");
		load(CZAS_LOC, czas, "czasowników");
		load(PRZYM_LOC, przym, "przymiotników");
		
		msg("\nZacznijmy!");
		msg("'start' - nowe zdanie!");
		msg("'dodaj' - dodaje wyraz");
		msg("'usun' - usuwa wyraz");
		msg("'wyczysc' - usuwa wszystkie wyrazy");
		msg("'wyrazy' - pokazuje wyrazy");
		msg("'stop' - konczy prace programu");
		msg("-----------------------------------");
		
		Scanner in = new Scanner(System.in);
		
		String[] input = {" "};
		while(!input[0].equalsIgnoreCase("exit")){
			
			input = in.nextLine().split(" ");
			cmd(input);
		}
		
		msg("Zapisywanie...");
		
		save(RZECZ_LOC, rzecz);
		save(CZAS_LOC, czas);
		save(PRZYM_LOC, przym);
		// END
	}
	
	private static void msg(String msg){
		System.out.println(msg);
	}
	
	public static void load(String path, List<String> in, String type){
		int count = 0;
		try {
			Scanner sc = new Scanner(Paths.get(path));
			while(sc.hasNext()){
				String word = sc.next();
				in.add(word);
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		msg("Za³adowano "+count+" "+type);
	}
	
	public static int save(String path, List<String> out){
		
		int nCount = 0;
		try {
			PrintWriter writer = new PrintWriter(path);
			while(out.size() != 0){
				writer.append(out.get(0)+" ");
				out.remove(0);
				if(nCount == 10){
					writer.append("\n");
					nCount = 0;
				}
				nCount++;
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return nCount;
	}
	
	public static void cmd(String[] cmd){
		
		Random r = new Random();
		
		if(cmd[0].equalsIgnoreCase("dodaj")){
			if(cmd[1].equalsIgnoreCase("rzeczownik") || cmd[1].equalsIgnoreCase("r")){
				rzecz.add(cmd[2]);
				msg("Dodales rzeczownik: "+cmd[2]);
				return;
			}
			if(cmd[1].equalsIgnoreCase("czasownik") || cmd[1].equalsIgnoreCase("c")){
				czas.add(cmd[2]);
				msg("Dodales czasownik: "+cmd[2]);
			}
			if(cmd[1].equalsIgnoreCase("przymiotnik") || cmd[1].equalsIgnoreCase("p")){
				przym.add(cmd[2]);
				msg("Dodales przymiotnik: "+cmd[2]);
			}
		}
		if(cmd[0].equalsIgnoreCase("start")){
			StringBuilder bud = new StringBuilder();
			String def = "ERROR ";
			for(int i=0; i<pattern.length(); i++){
				if(pattern.charAt(i) == 'r'){			//Rzeczownik random
					int los = r.nextInt(rzecz.size());
					bud.append(rzecz.get(los)+" ");
				}
				else if(pattern.charAt(i) == 'c'){		//Czasownik random
					int los = r.nextInt(czas.size());
					bud.append(czas.get(los)+" ");
				}
				else if(pattern.charAt(i) == 'p'){		//Przymiotnik random
					int los = r.nextInt(przym.size());
					bud.append(przym.get(los)+" ");
				}
				else bud.append(def);					//Default value
			}
			
			msg("== "+bud.toString()+" ==");
			return;
		}
	}
}
