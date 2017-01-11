package sortowanie_tablicy;

import java.util.ArrayList;
import java.util.Random;

public class Przygotowanie_do_spr {

	public static void main(String[] args) {
		
		Random r = new Random();
		int rand = r.nextInt(4);
		
		/**
		String[] tab = {"LO", "TRZCIANKA", "IM.", "ST.", "STASZICA"};
		
		StringBuilder b = new StringBuilder();
		for(String s : tab){
			b.append(s+" ");
		}
		msg(b.toString());			//MSG
		
		b = new StringBuilder();
		
		for(int i = 0; i<tab.length; i+=2){
			b.append(tab[i]+" ");
		}
		msg(b.toString());			//MSG
		
		Random r = new Random();
		msg(tab[rand]);				//MSG
		
		b = new StringBuilder();
		
		for(int i = tab.length-1; i>=0; i--){
			b.append(tab[i]+" ");
		}
		msg(b.toString());			//MSG
		
		*/
		// ZADANIE 2
		
		ArrayList<Integer> atab = new ArrayList<>();
		while(atab.size() != 7){
			rand = r.nextInt();
			if(rand >= -20 && rand <= 20){
				atab.add(rand);
			}
		}
		
		for(int i : atab){
			amsg(i+", ");
		}
		
		int min = atab.get(0);
		int max = atab.get(0);
		
		for(int i : atab){
			if(i<min) min = i;
			if(i>max) max = i;
		}
		
		msg("Max: "+max);
		int one = atab.get(0);
		int last = atab.get(atab.size()-1);
		if(one < last){
			msg("mniejszy  jest element ostatni o "+(one-last));
		}
		else
		{
			msg("mniejszy  jest element pierwszy o "+(last-one));
		}
		
		
		//SWAP
		int a,c;
		a = atab.get(0);
		c = atab.get(3);
		atab.set(3, a);
		atab.set(0, c);
		
		for(int i : atab){
			amsg(i+", ");
		}
		
		/**
		// ZADANIE 3
		int[] num = new int[5];
		for(int i = 0; i<num.length; i++){
			num[i] = r.nextInt(100);
		}
		
		String line1 = "";
		String line2 = "";
		int count = 0;
		int sum = 0;
		for(int i : num){
			line1 += i+"\t";
			if(i%3==0){
				line2 += "P\t";
				count++;
			}
			else{
				line2 += "N\t";
				sum += i;
			}
		}
		msg(line1);
		msg(line2);
		msg("Liczb podzielnych przez 3 jest: "+count);
		msg("Suma liczb niepodzielnych przez 3 to: "+sum);
		*/
	}
	
	private static void msg(String msg){
		System.out.println(msg);
	}
	
	private static void amsg(String msg){
		System.out.print(msg);
	}

}

class Auto
{
	private String nr;
	
	public Auto(String nr){
		this.nr = nr;
	}
	
}

class Audi extends Auto{

	public Audi(String nr) {
		super(nr);
	}
	
}
