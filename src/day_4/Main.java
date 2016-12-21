package day_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String chain = "abcdefghijklmnoprstuwqxyz";
		int space = 3;

		Scanner sc = new Scanner(System.in);
		msg("Podaj wyraz");
		String word = sc.next();
		
		StringBuilder nChain = new StringBuilder(word.length());
		for(int i=0; i<word.length(); i++){
			char c = word.charAt(i);
			int pos = chain.indexOf(c);
			
			msg("Char: "+c+" Indeks w zbiorze: "+pos);
			int value = pos+space;				// !!!!!!!!!!!
			char nC = ' ';
			if(value >= chain.length())
				{
					int diff = value - chain.length();
					nC = chain.charAt(diff);
				}
				else
				{
					nC = chain.charAt(value);
				}
			
			nChain.append(nC);
			msg("Char: "+nC+" Indeks w zbiorze: "+chain.indexOf(nC));
			msg("==================");
			
		}
		
		msg(nChain.toString());
		
	}
	
	private static void msg(String msg){
		System.out.println(msg);
	}

}
