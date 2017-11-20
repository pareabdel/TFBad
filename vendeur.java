public class vendeur extends commerciale{
 
        private static final double Pourcentage= 0.2;
    private final static int Bonus_vendeur= 100;

    public vendeur(String nom, String prenom, String matricule, int age, double date_entre, double Chiffre_affaire) {
        super(nom, prenom, matricule, age, date_entre, Chiffre_affaire);
    }

 public double Calculer_salaire() {
        return (Pourcentage* getChiffre_affaire() + Bonus_vendeur + Salaire_base);       
    }      
}
