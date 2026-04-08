import java.util.*;
public class MinMax{
    //fonction qui retourne l'indice du minimum
    public static int indiceMin(int[] Tab){
        int min = 0;
        for(int i=1; i<Tab.length; i++){
            if(Tab[i] < Tab[min]){
                min = i;
            }
        }
        return min;
    }

    //fonction qui retourne l'indice du minimum a partir d'une position
    public static int indiceMin(int[] Tab, int debut){
        int min = debut;
        for(int i=(debut+1); i<Tab.length; i++){
            if(Tab[i] < Tab[min]){
                min = i;
            }
        }
        return min;
    }

    //fonction qui retourne l'indice du maximum
    public static int indiceMax(int[] Tab){
        int max = 0;
        for(int i=1; i<Tab.length; i++){
            if(Tab[max] <= Tab[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;// taille du tableau
        int[] T2;
        
        do{
            System.out.println("Donner la taille du tableau:");
            n = sc.nextInt();
        }while(n<=0);

        T2 = new int[n];
        InitialiserTableau.initialiser_Random(T2);

        System.out.println("\nL'indice du minimum est: " + indiceMin(T2, 0));
        System.out.println("L'indice du maximum est: " + indiceMax(T2));

        sc.close();
    }
}