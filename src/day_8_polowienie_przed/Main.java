package day_8_polowienie_przed;

public class Main {

	public static double f(double x){ return x*x-5;}
	
	public static void main(String[] args) {
		
		double a = 0;
		double b = 6;
		
		double x0 = (a+b)/2;
		double c = f(x0);
		b = c;
		
		x0 = (a+b)/2;
		a = f(x0);
		
		x0 = (a+b)/2;
		c = f(x0);
		
	}

}
