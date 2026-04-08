public class Eleve{//debut de la classe
    private String Nom, Prenom;
    private char Sexe;
    private double noteInfo, noteMath, noteAng;

    //constructeurs
    public Eleve(){}
    public Eleve(String Nom, String Prenom, char Sexe, double noteInfo, double noteMath, double noteAng){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Sexe = Sexe;
        this.noteInfo = noteInfo;
        this.noteMath = noteMath;
        this.noteAng = noteAng;
    }

    //accesseurs
    public String getNom(){return Nom;}
    public String getPrenom(){return Prenom;}
    public char getSexe(){return Sexe;}
    public double getInfo(){return noteInfo;}
    public double getMath(){return noteMath;}
    public double getAng(){return noteAng;}

    //setters
    public void setNom(String Nom){this.Nom = Nom;}
    public void setPrenom(String Prenom){this.Prenom = Prenom;}
    public void setSexe(char Sexe){this.Sexe = Sexe;}
    public void setInfo(double noteInfo){this.noteInfo = noteInfo;}
    public void setMath(double noteMath){this.noteMath = noteMath;}
    public void setAng(double noteAng){this.noteAng = noteAng;}

    //initialiserEleve: initialiser les attributs d’un élève E passé en paramètre  
    /*public static void initialiserEleve(Eleve E){//user doit saisir dynamiquement les donnees       
        E.setNom("LO");
        E.setPrenom("Mansour");
        E.setSexe('M');
        E.setInfo(17);
        E.setMath(17);
        E.setAng(17);
    }

    //tester
    public static void main(String[] args){
        Eleve E1 = new Eleve();

        initialiserEleve(E1);

        System.out.println("Nom: " + E1.getNom());
        System.out.println("Prenom: " + E1.getPrenom());
    }*/
 //fin de la classe
}