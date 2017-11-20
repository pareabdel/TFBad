
import employe.Employe;


public class production extends Employe{
    
    private final static int unite= 5;
    private final int unite_protuit;

    public production(String nom, String prenom, String matricule, int age, double date_entre,int unite_produit) {
        super(nom, prenom, matricule, age, date_entre);
        this.unite_protuit=unite_produit;
    }
      
    
    public double calculer_Salaire(){
       return (unite * unite_protuit) + Salaire_base; 
    }
  }

