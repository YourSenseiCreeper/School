package day_2;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // nie wiem po co to komentowa�
		System.out.println("Podaj literk�: ");
		String wyb = sc.next();
		
		switch(wyb){
			case "a":
			{
				System.out.println("Tekst 1"); break;
			}
			case "b":
			{
				System.out.println("Tekst 2"); break;
			}
			default:
			{
				System.out.println("Tekst 3"); break;
			}
		}
	}

}
