package zegarek;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Date dt = new Date();
		long t1 = dt.getTime();
		System.out.println(t1);
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long diff = (new Date().getTime() - t1)/1000;
		System.out.print(diff+" sekund");

	}

}
