package day_2;

public class Main2 {

	public static void main(String[] args) {
		
		String msg1 = "stopnie\t|\twartosc sinusa";
		System.out.println(msg1);
		StringBuilder s = new StringBuilder();
		for(int i = 0; i>msg1.length(); i++){
			s.append("-");
		}
		System.out.println(s.toString());
		
		for(int l = 1; l<=18; l++){
			double a = (10*l*Math.PI)/180;
			double sin = Math.sin(a);
			
			System.out.println("\t"+l*10+"|\t"+sin+"|\t"+Math.cos(a));
		}
		
		

	}

}
