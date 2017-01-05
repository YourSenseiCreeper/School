package sortowanie_tablicy;

public class Sortowanie {

	public static void main(String[] args) {
		
		int[] tab = {5, 17, 33, 1, 4, 9, 41};
		int min = tab[0];
		int max = tab[0];
		
		for(int i : tab){
			if(i<min) min = i;
			if(i>max) max = i;
		}
		
		System.out.println("Min: "+min+", max: "+max);
		
	}

}
