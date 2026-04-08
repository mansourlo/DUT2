public class Eleve{
    //attributs
    private String nom, prenom;
    private EnumSexe sexe;
    private double[] notes;

    //constructeurs
    public Eleve(){}
    public Eleve(String nom, String prenom, EnumSexe sexe, double[] notes){
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.notes = notes;
    }

    //geters
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public EnumSexe getSexe(){return sexe;}
    public double[] getNotes(){return notes;}

    //seters
    public void setNom(String nom){this.nom = nom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    public void setSexe(EnumSexe sexe){this.sexe = sexe;}
    public void setNotes(double[] notes){this.notes = notes;}

    //saisi des notes individuellement
    public void setMath(double noteMath){this.notes[0] = noteMath;}
    public void setInfo(double noteInfo){this.notes[1] = noteInfo;}
    public void setAng(double noteAng){this.notes[2] = noteAng;}

    //fonction initialiserEleve
    public static void initialiserEleve(Eleve E){
        E.setNom("LO");
        E.setPrenom("Mansour");
        E.setSexe(EnumSexe.valueOf("M")); // ou EnumSexe.M
        E.setNotes(new double[]{17, 17, 17});
    }

    //methode afficherEleve
    public static void afficherEleve(Eleve E){
        System.out.println("Nom: "+E.getNom());
        System.out.println("Prenom: "+E.getPrenom());
        System.out.println("Sexe: "+E.getSexe());
        // ! System.out.println("Notes: "+E.getNotes());

        if(E.getNotes() != null){
            System.out.println("Note Math: " + E.getNotes()[0]);
            System.out.println("Note Info: " + E.getNotes()[1]);
            System.out.println("Note Ang: " + E.getNotes()[2]);
        }
    }

    public static void main(String args[]){
        Eleve E1 = new Eleve();
        initialiserEleve(E1);
        afficherEleve(E1);
    }
}
// ? initialisation avec Scanner
/*  char c = sc.next().toUpperCase().charAt(0);
    EnumSexe s = EnumSexe.valueof(s); //gerer les exceptions

    E.setSexe(s);
*/
  
/*  char a pour classe Character
    transformer char en objet
        Character c1 = Character.valueOf(c);
    
    String str = c1.toString().toUpperCase();*/