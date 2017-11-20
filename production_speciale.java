

public class production_speciale extends production implements interface_risque{


    public production_speciale(String nom, String prenom, String matricule, int age, double date_entre, int unite_produit) {
        super(nom, prenom, matricule, age, date_entre, unite_produit);
    }

   
    public double calculer_Salaire(){
        double prime = 25000;
        return super.calculer_Salaire() + prime + Salaire_base;
    } 
 }    

