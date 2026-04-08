import java.util.Random;
public class Moyenne{
    public static double moyenneTab(int[] tab){
        int sum = 0;
        for(int i=0; i<tab.length; i++)
            sum += tab[i];
        
        double moyenne = (double) sum / tab.length; // si on enleve le casting on aura une moyenne entiere
        return moyenne;
    }

    public static void main(String[] args){
        Random rand = new Random();
        int n;
        int[] T1;

        do{
            n = rand.nextInt(10);
        }while(n<=0);

        T1 = new int[n];
        for(int i=0; i<n; i++){
            T1[i] = rand.nextInt(20);
        }

        double result = Math.round(moyenneTab(T1) * 100.0) / 100.0;
        System.out.println("La moyenne des elements vaut: "+result);
    }
}