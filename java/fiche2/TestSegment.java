//import java.util.Scanner;
public class TestSegment{
    //fonction creerSegment: creer et initialiser un segment
    public static void creerSegment(Segment S){
        Point pointA = new Point(4, 3);
        Point pointB = new Point(2,1);

        S = new Segment(pointA, pointB);

        //S.setA(pointA);
        //S.setB(pointB);
    }

    //tester creerSegment
    public static void main(String[] args){
        Segment S1 = new Segment();

        creerSegment(S1);

        System.out.println("Point A (" + S1.getA().getX() + ", " + S1.getA().getY() + ")");
        System.out.println("Point B (" + S1.getB().getX() + ", " + S1.getB().getY() + ")");
    }
}