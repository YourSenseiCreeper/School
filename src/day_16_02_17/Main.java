package day_16_02_17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer[]> triplets = new ArrayList<>();
		
		
		//300 liczb;
		int[] liczby = new int[300];
		Random r = new Random();
		
		for(int i=0; i<300; i++){
			liczby[i] = r.nextInt(20);
		}
		
		File f = new File("src/day_16_02_17/liczby.txt");
		try {
			
			if(!f.exists()) f.createNewFile();
			PrintWriter pw = new PrintWriter(f);
			
		int count = 0;
		Integer[] tri = new Integer[3];
		
		for(int i : liczby){
			pw.append(i+" ");
			tri[count] = i;
			count++;
			
			if(count == 3){
				pw.append("\n");
				count = 0;
				triplets.add(tri);
				tri = new Integer[3];
			}
		}
		pw.close(); // Zamykanie w¹tkus
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Zakoñczono!");
		
		System.out.println("Wczytywanie...");
		
		int cnt2 = 0;
		int a,b,c,sum;
		int wynik;
		Scanner sc = new Scanner("src/day_16_02_17/liczby.txt");
		List<String> triangles = new ArrayList<String>();
		List<Integer> sums = new ArrayList<Integer>();
		List<Integer> sumsAll = new ArrayList<Integer>();
		for(Integer[] i : triplets){
			a = i[0];
			b = i[1];
			c = i[2];
			sum = a+b+c;
			sums.add(sum);
			if( (a+b>c) && (a+c>b) && (b+c>a)) triangles.add(i[0]+" "+i[1]+" "+i[2]);
			System.out.println(i[0]+" "+i[1]+" "+i[2]);
			
			wynik = 0;
				while(a!=0){
					wynik += a%10;
					a = a / 10;
				}
				while(b!=0){
					wynik += b%10;
					b = b / 10;
				}
				while(c!=0){
					wynik +=c%10;
					c = c / 10;
				}
			sumsAll.add(wynik);
			
		}
		exportToFile("trojkaty.txt", triangles.toArray());
		
		List<String> sumsStr = new ArrayList<String>();
		for(Integer i : sums){
			sumsStr.add(i+"");
		}
		exportToFile("sumy.txt", sumsStr.toArray());
		
		int min = sumsAll.get(0);
		int minIndx = 0;
		int max = sumsAll.get(0);
		int maxIndx = 0;
		List<String> sumsAllstr = new ArrayList<String>();
		for(Integer i : sumsAll){
			if(i<min) min = i; minIndx = sumsAll.indexOf(i);
			if(i>max) max = i; maxIndx = sumsAll.indexOf(i);
		}
		sumsAllstr.add("Min - Index: "+minIndx+" - "+min);
		sumsAllstr.add("Max - Index: "+maxIndx+" - "+max);
		exportToFile("b.txt", sumsAllstr.toArray());
	}
	
	public static void exportToFile(String name, Object[] objects){
		File f = new File("src/day_16_02_17/"+name);
				try {
					if(!f.exists()) f.createNewFile();
					PrintWriter pw = new PrintWriter(f);
					for(Object line : objects){
						pw.write(line+"\n");
					}
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}

