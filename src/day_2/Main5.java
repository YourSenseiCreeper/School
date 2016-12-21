package day_2;

import java.util.*;

public class Main5 {

	public static void main(String[] args) {
		
		char c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		msg("Podaj znak (+,-,*,/)");
		
		c = sc.next().charAt(0);
		double a,b;
		switch(c)
		{
			case '+':
			{
				msg("Podaj a");
				a = Double.parseDouble(sc.next());
				msg("Podaj b");
				b = Double.parseDouble(sc.next());
				double wyn = a+b;
				msg("Wynik to: "+wyn);
				break;
			}
			case '-':
			{
				msg("Podaj a");
				a = Double.parseDouble(sc.next());
				msg("Podaj b");
				b = Double.parseDouble(sc.next());
				double wyn = a-b;
				msg("Wynik to: "+wyn);
				break;
			}
			case '*':
			{
				msg("Podaj a");
				a = Double.parseDouble(sc.next());
				msg("Podaj b");
				b = Double.parseDouble(sc.next());
				double wyn = a*b;
				msg("Wynik to: "+wyn);
				break;
			}
			case '/':
			{
				msg("Podaj a");
				a = Double.parseDouble(sc.next());
				msg("Podaj b");
				b = Double.parseDouble(sc.next());
				double wyn = a/b;
				msg("Wynik to: "+wyn);
				break;
			}
			
		}
		
	}
	
	private static void msg(String m){
		System.out.println(m);
	}
}


