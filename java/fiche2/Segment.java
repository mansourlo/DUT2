public class Segment{
    //attributs
    private Point A;
    private Point B;

    //constructeurs
    public Segment(){
        //si A et B ont pour valeur par defaut le point d'origine du repere
        A = new Point(0, 0);
        B = new Point(0, 0);
    };
    public Segment(Point A, Point B){
        this.A = A;
        this.B = B;
    }

    //accesseurs
    public Point getA(){return A;}
    public Point getB(){return B;}

    //setteurs
    public void setA(Point A){
        this.A = A;
    }
    public void setB(Point B){
        this.B = B;
    }
}