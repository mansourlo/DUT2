import java.util.Scanner;
import java.util.Random;
public class InitialiserTableau{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n;// taille du tableau
        int[] T1; 
        do{
            System.out.println("Donner la taille du tableau:");
            //n = sc.nextInt();
            n = rand.nextInt(6); //taille du tableau avec random            
        }while(n<=0);

        T1 = new int [n];
        initialiser_Random(T1);

    }

    //Saisie des valeurs du tableau avec la classe Scanner
    public static void initialiser_Scanner(int[] Tab){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<Tab.length; i++){
            System.out.println("Veuillez saisir l'element " + (i+1));
            Tab[i] = sc.nextInt();
        }

        System.out.println("Affichage du Tableau:");
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i] + " ");
        }
    }

    //Saisie des valeurs du tableau avec la classe Random
    public static void initialiser_Random(int[] Tab){
        Random rand = new Random();

        for(int i=0; i<Tab.length; i++){
            Tab[i] = rand.nextInt(20);
        }

        System.out.println("Affichage du Tableau:");
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i] + " ");
        }
    }

}