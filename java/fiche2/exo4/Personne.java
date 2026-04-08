public abstract class Personne{
    //attibuts d'une personne
    protected String nom, prenom;
    protected int age;
    protected Place place;

    //constructeurs
    public Personne(){}
    public Personne(String nom, String prenom, int age, Place place){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.place = place;
    }

    //getters
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}
    public Place getPlace(){return place;}

    //setters
    public void setNom(String nom){this.nom = nom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    public void setAge(int age){this.age = age;}
    public void setPlace(Place place){this.place = place;}

    public abstract int payer();
}