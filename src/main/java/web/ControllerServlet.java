package web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.IMetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

public class ControllerServlet extends HttpServlet {
	
	private IMetierCatalogue metier;
	
@Override
public void init() throws ServletException {
	metier =new MetierImpl();
	
	
	
}



@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {


	String mc =request.getParameter("motcle");//lire donné de requet
	ProduitModele mod = new ProduitModele();//cré instance de modé
	mod.setMotclé(mc);//sotkcé
	List<Produit>prod = metier.getProduitsparmc(mc);//recupré resultat
	mod.setProduits(prod);//recupré result dans le model
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);

	}
	
	

}
