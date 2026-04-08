import java.util.Random;
public class PlusGrand{
    public static double elementMax(double[] Tab){
        double max = Tab[0];
        for(int i=1; i<Tab.length; i++){
            if(Tab[i] > max)
                max = Tab[i];
        }
        return max;
    }

    public static void main(String[] args){
        double[] T1 = new double[5];
        Random rand = new Random();
        for(int i=0; i<T1.length; i++)
        T1[i] = Math.round(rand.nextDouble(20) * 100.0) / 100.0;

        System.out.println("Affichage avant tri:");
        for(int i=0; i<T1.length; i++){
            System.out.println(T1[i]);
        }

        double maximum = elementMax(T1);
        System.out.println("Le plus grand element du tableau est: "+maximum);
    }
}