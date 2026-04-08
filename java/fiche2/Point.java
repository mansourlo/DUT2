public class Point{
    //attributs
    private double x;
    private double y;

    //constructeur avec et sans param
    public Point(){
        x = 0; //valeur par defaut: origine du repere
        y = 0;
    };

    public Point(double x, double y){
        this.x = x; //this est une instance de la classe Point
        this.y = y;
    }

    //accesseurs: permettent d'acceder a l'attribut private hors de classe
    public double getX(){ return x;}
    public double getY(){return y;}
    
    //setteurs: permettent de modifier l'attribut private hors de classe
    public void setX(double x){this.x = x;}
    public void setY(double x){this.y = y;}
}