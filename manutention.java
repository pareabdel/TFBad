package employe;


public class manutention extends Employe{
   
    private final static int Salaire_horaire= 65;
    private final int heures;

    public manutention(String nom, String prenom, String matricule, int age, double date_entre,int heures) {
        super(nom, prenom, matricule, age, date_entre);
        this.heures=heures;
    }
      
    
    @Override
    public double calculer_Salaire(){
        return (Salaire_horaire * heures) + Salaire_base;
    }
  }

