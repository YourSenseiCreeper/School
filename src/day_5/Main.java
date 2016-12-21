package day_5;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Ma klucz przestawienia do ka¿dej litery
		// KONIEC
		
		//K L A S A
		//K = 10, L = 3, A = 7, S = 9
		//10 3 7 9 7
		
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
		
		String word = sc.next().toLowerCase();
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
		
		//bud.delete(0, bud.length());
		
		
		msg("Deszyfrator (oddzielaj spacjami kolejne znaki!) ");			// Problemy przy deszyfrowaniu
		String[] chars = sc.next().split(" ");	
		for(String s : chars){
			msg(s);
		}
		bud = new StringBuilder();
		int bufor = 0;
		for(String c : chars){
			bufor = Integer.parseInt(c);
			if(dehash.containsKey(c))
			{
				bud.append(dehash.get(bufor)+"");
			}
			else
			{
				msg("Z³y kod!");
				break;
			}
		}
		msg("Zakodowana wiadomoœæ: "+bud.toString());
	}
	
	static void msg(String msg){
		System.out.println(msg);
	}

}
