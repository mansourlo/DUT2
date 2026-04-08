public class TestPoint{
    //fonction distance
    public static double distance(Point pointA, Point pointB){
       double dx = pointB.getX() - pointA.getX();
       double dy = pointB.getY() - pointA.getY();

       return Math.sqrt(dx*dx + dy*dy);
    }

    //teste avec main
    public static void main(String[] args){
        //Point p1 = new Point(4, 3);
        //Point p2 = new Point(5,7);
        
        //definition du point A avec constructeur sans parametre
        Point A = new Point();
        A.setX(4);
        A.setY(3);

        //definition du point B avec constructeur avec parametre
        Point B = new Point(5, 7);

        double result = distance(A, B);
        System.out.printf("La distance entre les 2 points vaut: %.3f", result);
    }
}
