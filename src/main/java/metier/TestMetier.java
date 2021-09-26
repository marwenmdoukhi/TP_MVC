package metier;

import java.util.ArrayList;
import java.util.List;

public class TestMetier {

	public static void main(String[] args) {

		MetierImpl metierImpl = new MetierImpl();
		List<Produit> prods = metierImpl.getProduitsparmc("l");
	
		
		for(Produit f:prods) {
			System.out.println(f.getNomProduit());

			
		}
	}
		

}
