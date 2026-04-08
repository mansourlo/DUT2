public class Classe{
    private String className;
    private int nbEleve;
    private int promo;
    private Eleve[] liste;

    //constructeur
    public Classe(){}
    public Classe(String className, int nbEleve, int promo, Eleve[] liste){
        this.className = className;
        this.nbEleve = nbEleve;
        this.promo = promo;
        this.liste = liste[];
    }

    //getteurs
    public String getName(){return className;}
    public int getNb(){return nbEleve;}
    public int getPromo(){return promo;}
    public Eleve getListe(){return liste[];}

    //setteurs
    public void setName(String className){this.className = className;}
    public void setNb(int nbEleve){this.nbEleve = nbEleve;}
    public void setPromo(int promo){this.promo = promo;}
    public void setListe(Eleve[] liste){this.liste = liste[];}

    //initialiserClasse: permet d’initialiser les attributs  d’une classe C passée en paramètre  
    /*public static void initialiserClasse(Classe C){
        C.getName();
        C.getNb();
        C.getPromo();
        C.getListe();
    }

    public static void main(String[] args){
        //Eleve E1 = new Eleve("Lo", "Mansour", 'M', 17, 17, 17);
        //Eleve E2 = new Eleve("10", "SM", 'M', 17, 17, 17);
        Eleve liste[0] = new Eleve("Lo", "Mansour", 'M', 17, 17, 17);
        Classe C1 = new Classe("DUT2-Info", 36, 2026, liste);

        initialiserClasse(C1);
    }*/
}