package interfejsy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Lalka l = new Lalka();
		PanTadeusz p = new PanTadeusz();
		
		List<Ksi��ka> ks = new ArrayList<>();
		ks.add(l);
		ks.add(p);
		
		for(Ksi��ka k : ks){
			System.out.println(k.getAuthor()+" - "+k.getTitle());
		}

	}

}
