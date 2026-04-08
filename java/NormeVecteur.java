public class NormeVecteur{
    public static void main(String args[]){
        //System.out.printf("La norme du vecteur(5, -4) est: %.3f", norme(0, 0));
        double result = Math.round(norme(5, -4) * 1000.0)/1000.0;
        System.out.println("Norme = " + result);
    }

    public static double norme(double x, double y){
        double Xcarre = Math.pow(x, 2), Ycarre = Math.pow(y, 2);
        return Math.sqrt(Xcarre + Ycarre);
    }
}