package day_2;

import java.util.*;

public class Main6 {

	public static void main(String[] args) {
		
		int c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		msg("Podaj wybor (1,2,3)");
		
		byte licz = 5;
		
		msg(Integer.toBinaryString(licz));
		
		c = Integer.parseInt(sc.next());
		switch(c)
		{
			case 1:
			{
				for(char l = 'a'; l<='z'; l++){
					msg(""+l);
				}
				break;
			}
			case 2:
			{
				for(char l = 'z'; l>='a'; l--){
					msg(""+l);
				}
				break;
			}
			case 3:
			{
				for(int a = 0; a<100; a++){
					if(a%3==0) msg(""+a);
				}
				break;
			}
			default: msg("Nic nie wybrales!"); break;
			
		}
		
	}
	
	private static void msg(String m){
		System.out.println(m);
	}
}


