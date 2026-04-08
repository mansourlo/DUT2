package ecole;
public class Etudiant{
    // declaration des attributs
    public String Ine, Prenom, Nom;

    //declaration d'un constructeur avec parametres
    public Etudiant(String vIne, String vPrenom, String vNom){
        Ine = vIne; 
        Prenom = vPrenom;
        Nom = vNom;
    }

    //declaration des methodes
    public String getIne(){ return Ine;}
    public String getPrenom(){ return Prenom;}
    public String getNom(){ return Nom;}
    
    public void setIne(String vIne){ Ine = vIne;}
}