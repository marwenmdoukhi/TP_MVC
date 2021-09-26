package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.DynamicAny._DynEnumStub;

public class MetierImpl implements IMetierCatalogue {

	@Override
	public List<Produit> getProduitsparmc(String mc) {
		List<Produit>prods = new ArrayList<Produit>();
		Connection connection =SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from produits  where  Nom_Produit like ?");
			ps.setString(1,"%"+ mc +"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit produit =new Produit();
				produit.setIdProduit(rs.getLong("Id_Produit"));
				produit.setNomProduit(rs.getString("Nom_Produit"));
				produit.setPrix(rs.getDouble("Prix"));
				prods.add(produit);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
		
		return prods;
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	
	
}
