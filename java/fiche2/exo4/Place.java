public class Place{
    //attributs de la classe
    private int numPlace;
    private boolean occupe;

    //les constructeurs
    public Place(){};
    public Place(int numPlace, boolean occupe){
        this.numPlace = numPlace;
        this.occupe = occupe;
    }

    //getters
    public int getNumPlace(){return numPlace;}
    public boolean getOccupe(){return occupe;}

    //setters
    public void setNumPlace(int numPlace){this.numPlace = numPlace;}
    public void setOccupe(boolean occupe){this.occupe = occupe;}
}