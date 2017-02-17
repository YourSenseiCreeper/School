package day_7_inNout;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = null;
		File f = new File("abc.txt");
		try {
			if(!f.exists()){
				f.createNewFile();
			}
			out = new PrintWriter("abc.txt");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
		
		System.out.println("Podaj jakiœ tekst:\n");
		System.out.println(f.getAbsolutePath());
		out.append(sc.nextLine());
		out.close();
		
	}

}
