package day_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main4 {

	public static void main(String[] args) {
		
		Queue<String> imiona = new LinkedList<>();
		String[] im = {"Damian", "Robert", "Maciek", "Krzysiu", "Daniel", "Bartek", "Julia", "Seba", "Tomek", "Piotrek"};
		imiona.addAll(Arrays.asList(im));
		
		HashMap<Integer, String> im2 = new HashMap<>(20);
		
		int l = 1;
		for(String s : imiona){
			System.out.println("Numer: "+l+" | Imie: "+s);
			im2.put(l, s);
			l++;
		}
		
		int a,b;
		a = 2; b = 3;
		String as = a > b ? "a" : "b";
		
		System.out.println(im2.toString());

	}

}
