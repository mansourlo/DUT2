public class Etudiant extends Personne{
   // private static final int TARIF = 3000;
    private int tarif;

    public Etudiant(){}
    public Etudiant(String nom, String prenom, int age, Place place, int tarif){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.place = place;
        this.tarif = tarif;
    }
    }

    public int getTarif(){return tarif;}
    public void setTarif(int tarif){this.tarif = tarif;}
    
    //redefinition de la methode getAge() heritèe de Personne;
    public int getAge(){return age+10;}

    public int payer(){
        return TARIF;
    }
}

/* il possble de redefinir des methodes deja implementees dans Personne
redefinir: on garde la signature mais le corps(comportement) va changer*/
//? tjr mettre les attributs de la classe super(mere) en protected 