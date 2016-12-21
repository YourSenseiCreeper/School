package day_1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Podaj liczbê:\n");
		Scanner in = new Scanner(System.in);
		n = Integer.parseInt(in.next());
		
		for(int i=n; i>0; i--){
			System.out.println("JAVA!");
		}
	}

}
