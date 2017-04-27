package day_5_szyfrator;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// GENERATOR
		String let = "abcdefghijklmnoprstuwqxyz";
		Random r = new Random();
		HashMap<Character, Integer> hash = new HashMap<>();
		HashMap<Integer, Character> dehash = new HashMap<>();
		msg(let.length() +" rozmiar lenght");
		hash.put(' ', 1);
		
		int numb = 0;
		for(int i = 0; i<let.length(); i++){
			do
			{
				numb = r.nextInt(let.length()+1);
			}
			while(hash.containsValue(numb));
			
			hash.put(let.charAt(i), numb);
			dehash.put(numb, let.charAt(i));
		}
		
		msg(hash.toString());
		Scanner sc = new Scanner(System.in);
		
		msg("Podaj wyraz do zaszyfrowania: ");
		sc.hasNext();
		
		// DESZYFROWANIE
	
		String word = sc.nextLine().toLowerCase();
		String[] spacje = word.split(" ");
		StringBuilder bud = new StringBuilder();
		
		for(String s : spacje)
		{
			for(int i = 0; i<s.length(); i++)
			{
				char litera = s.charAt(i);
				bud.append(hash.get(litera)+" ");
			}
			bud.append("1 ");
		}

		msg("Zaszyfrowany wyraz: "+bud.toString());
		msg("Deszyfrator (oddzielaj spacjami kolejne znaki!)");
		
		word = sc.nextLine();		
		spacje = word.split(" ");
		StringBuilder bud2 = new StringBuilder();
		int bufor = 0;
		
		for(String c : spacje){
			bufor = Integer.valueOf(c);
			if(bufor == 1){
				bud2.append(" ");
				continue;
			}
			if(hash.containsValue(bufor))
			{
				bud2.append(dehash.get(bufor)+"");
			}
			else
			{
				msg("Z³y kod!");
				break;
			}
		}
		msg("Zakodowana wiadomoœæ: "+bud2.toString());
	}
	
	static void msg(String msg){
		System.out.println(msg);
	}

}
