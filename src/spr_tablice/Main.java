package spr_tablice;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		
		char[] tab = {'I', 'N', 'F', 'O', 'R', 'M', 'A', 'T', 'Y', 'K', 'A'};  
		
		StringBuilder b = new StringBuilder();
		for(char s : tab){
			b.append(s+".");
		}
		msg(b.toString());			//MSG
		
		b = new StringBuilder();
		
		for(int i = 0; i<tab.length; i+=2){
			b.append(tab[i]+" ");
		}
		
		msg(b.toString());			//MSG
		
		int rand = r.nextInt(4);
		msg("wylosowano "+(rand+1)+": litera "+tab[rand]);				//MSG
		
		b = new StringBuilder();
		
		for(int i = tab.length-1; i>=0; i--){
			b.append(tab[i]+"");
		}
		msg(b.toString());			//MSG
		
		msg("================");
		
		// ZADANIE 2
		
		//ArrayList<Integer> atab = new ArrayList<>();
		//Object[] ntab = atab.toArray();
		int[] intab = new int[12];
		
		
		for(int i = 0; i<12; i++){
			intab[i] = r.nextInt(100)-50;
		}
		
		for(int i : intab){
			amsg(i+", ");
		}
		
		int min = intab[0];
		int max = intab[0];
		
		for(int i : intab){
			if(i<min) min = i;
			if(i>max) max = i;
		}
		
		msg("\nMax: "+max);
		int one = intab[0];
		int last = intab[intab.length-1];
		if(one < last){
			msg("mniejszy  jest element ostatni o "+(one-last));
		}
		else
		{
			msg("mniejszy  jest element pierwszy o "+(last-one));
		}
		
		
		//SWAP 0 & 5
		int a,c;
		a = intab[0];
		c = intab[5];
		intab[5] = a;
		intab[0] = c;
		
		//SWAP 2 & 7
		int d,e;
		d = intab[2];
		e = intab[7];
		intab[5] = d;
		intab[0] = e;
		
		for(int i : intab){
			amsg(i+", ");
		}
		
		msg("\n--------------------");
		for(int j = 0; j<intab.length-1; j++){
		for(int i = 0; i<intab.length-1; i++){
			if(intab[i] < intab[i+1]){
				int big,small;
				big = intab[i+1];
				small = intab[i];
				intab[i] = big;
				intab[i+1] = small;
			}
		}
		}
		
		for(int i : intab){
			amsg(i+", ");			//MSG
		}
		
		msg("\n================");
		
		// ZADANIE 3
		
		int[] liczby = new int[10];
		char[] znaki = new char[10];
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i<10; i++){
			liczby[i] = r.nextInt(30)-15;
		}
		
		amsg("tablica1:\t");
		for(int i : liczby){
			amsg(i+"\t");
		}
		
		amsg("\n");
		
		for(int i = 0; i<liczby.length; i++){
			if(liczby[i] %2 == 0){
				znaki[i] = 'p';
				count++;
			}
			else{
				znaki[i] = 'n';
				sum += liczby[i];
			}
		}
		
		amsg("tablica2:\t");
		for(char ca : znaki){
			amsg(ca+"\t");
		}
		amsg("\n");
		
		msg("Liczb parzystych jest: "+count);
		msg("Suma liczb nieparzystych: "+sum);
	}
	
	private static void msg(String msg){
		System.out.println(msg);
	}
	
	private static void amsg(String msg){
		System.out.print(msg);
	}

}
