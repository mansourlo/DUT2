import java.util.Scanner;
public class TestEleve{
    public static void creerEleve(Eleve E){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom:");
        String nom = sc.nextLine();

        System.out.println("Prenom:");
        String prenom = sc.nextLine(); //E.setPrenom(sc.nextLine());

        System.out.println("Sexe:");
        char sexe = sc.next().charAt(0);

        System.out.println("Note informatique:");
        double note1 = sc.nextDouble();

        System.out.println("Note Maths:");
        double note2 = sc.nextDouble();

        System.out.println("Note Anglais:");
        double note3 = sc.nextDouble();
        
        E.setNom(nom);
        E.setPrenom(prenom);
        E.setSexe(sexe);
        E.setInfo(note1);
        E.setMath(note2);
        E.setAng(note3);
    }

    public static void main(String[] args){
        Eleve E1 = new Eleve();

        creerEleve(E1);

        System.out.println("Nom: " + E1.getNom());
        System.out.println("Prenom: " + E1.getPrenom());

    }
}