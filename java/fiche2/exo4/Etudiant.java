public class Etudiant extends Personne{
    //private static final int TARIF = 3000;
    private int tarif;

    public Etudiant(){        
        this.age = 20; //appel d'un attibut protected

        //this.setAge(age: 20); appel d'un attribut private herité
    }
    public Etudiant(String nom, String prenom, int age, Place place, int tarif){
        super(nom, prenom, place); //? appel du constructeur avec parametre de la classe Personne
        this.tarif = tarif; // super() n'initialise que les parametres de la classe mere
    }
    
    public int payer(){
        return TARIF; 
    }
}