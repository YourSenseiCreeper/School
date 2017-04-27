package day_6;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Object> mapa = new HashMap<>(2);
		mapa.put("Numer1", 3);
		mapa.put("Numer2", true);
		
		System.out.println(mapa.toString());
		
		Scanner sc = new Scanner(System.in);
		msg("Podaj liczbe do przekonwertowania: ");
		
		String liczba = sc.next();
		
		
		
	}
	
	static void msg(String msg){
		System.out.println(msg);
	}

}
