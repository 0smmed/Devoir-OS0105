package DAO;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBC.Dbconnection;
import Metiers.Medicament;


//accéder aux données de la table "Medicament" dans la base de données.
public class MedicamentDAO implements dao<Medicament> {
	private Connection conn;

    // Constructeur de la classe qui établit la connexion à la base de données.
   
    public MedicamentDAO() throws SQLException {
        conn = Dbconnection.getInstance().getConnection();
    }

    //Sélection par ID 
    public Medicament get(long id) {
    	Medicament medicament = null;
        String requete = "SELECT * FROM Medicament WHERE id = " + (int) id;
        System.out.println(requete);
        try {
            Statement pstm = conn.createStatement();
            ResultSet rs = pstm.executeQuery(requete);
            if (rs.next()) {
            	
            // Si une Medicament est trouvée, récupère les informations et crée un objet Medicament.
            	String code = rs.getString("code");
            	String emplacement = rs.getString("emplacement");
            	String dosage = rs.getString("dosage");
                int prix_parmite = rs.getInt("prix_parmite");
                String stock_disponible = rs.getString("stock_disponible");
                medicament = new Medicament(code, emplacement,dosage,prix_parmite,stock_disponible);
                System.out.println(medicament.toString());
                System.out.println();
            } else
            	
            // Lance une exception si la Medicament n'est pas trouvée.
                throw new SQLException();
        } catch (SQLException e) {
            System.out.println("Erreur SQL... élément introuvable");
            e.printStackTrace();
        }
        return medicament;
    }
     
    	//selection *
    		@Override
    		public List<Medicament> getAll() {
    			// TODO Auto-generated method stub
    			Medicament medicament = null;
    			ArrayList<Medicament> arrayList = new ArrayList<>();
    			String requete = "SELECT * FROM Bibliotheque";
    			System.out.println(requete);
    			try {
            Statement pstm = conn.createStatement();
            ResultSet rs = pstm.executeQuery(requete);
            if (rs.next())
            	
            // Si au moins une Medicament est trouvée, récupère les informations et crée des objets Medicament.
                do {
                	String code = rs.getString("code");
                	String emplacement = rs.getString("emplacement");
                	String dosage = rs.getString("dosage");
                    int prix_parmite = rs.getInt("prix_parmite");
                    String stock_disponible = rs.getString("stock_disponible");
                    medicament = new Medicament(code, emplacement,dosage,prix_parmite,stock_disponible);
                    arrayList.add(medicament);
                    System.out.println(medicament.toString());
                } while (rs.next());
            else
            	
            // Lance une exception si aucune Medicament n'est trouvée.
                throw new SQLException();
        } catch (SQLException e) {
            System.out.println("Erreur SQL... éléments introuvables");
            e.printStackTrace();
        }
        return arrayList;
	}


	@Override
	public void save(Medicament t) {
		// TODO Auto-generated method stub
		  String requete = "INSERT INTO Medicament(code, emplacement, dosage,prix_parmite,stock_disponible) VALUES" + "()";
	        System.out.println(requete);
	        try {
	            Statement pstm = conn.createStatement();
	            int rs = pstm.executeUpdate(requete);
	            if (rs > 0)
	                System.out.println("\tMedicament enregistrée !\n");
	            else
	                throw new SQLException();
	        } catch (SQLException e) {
	            System.out.println("Erreur SQL... enregistrement échoué");
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void update(Medicament t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Medicament t) {
		// TODO Auto-generated method stub
		
	}
	
	
 //test des opérations CRUD de la classe MedicamentDAO.
    
    public static void main(String[] args) throws SQLException {
    	MedicamentDAO medicamentdao = new MedicamentDAO();
    	Medicament medicament1= new Medicament("MDE"," DD" ,"7YU",700,"LM");
    	medicamentdao.save(medicament1);
    }
}


