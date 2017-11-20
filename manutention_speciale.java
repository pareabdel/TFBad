package employe;

public class manutention_speciale extends manutention implements interface_risque{
    private double prime;

    public manutention_speciale(String nom, String prenom, String matricule, int age, double date_entre, int heures) {
        super(nom, prenom, matricule, age, date_entre, heures);
    }

    /**
     *
     * @return
     */
    @Override
    public double calculer_Salaire(){
        return super.calculer_Salaire() + prime + Salaire_base + prime;
    }
 }