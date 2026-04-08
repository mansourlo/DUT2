import ecole.Etudiant;

public class TestEtudiant{
    public static void main(String[] args){
        Etudiant E1 = new Etudiant("20240CMU8", "Mansour", "LO");
        IO.println("INE: " + E1.getIne());
        IO.println("Prenom: " + E1.getPrenom());
        IO.println("Nom: " + E1.getNom());
    }
}