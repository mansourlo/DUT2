import java.util.*;
public class AfficherTableau{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;// taille du tableau
        int[] T; 
        do{
            System.out.println("Donner la taille du tableau:");
            n = sc.nextInt();
        }while(n<=0);

        T = new int[n];
        InitialiserTableau.initialiser_Random(T);

        //showTab(T);
    }

    //methode afficher Tableau
    public static void showTab(int[] Tab){
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i] + " ");
        }
    }
}