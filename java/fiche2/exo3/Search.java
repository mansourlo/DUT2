import java.util.*;
public class Search{
    public static boolean recherche(int[] Tab, int x){ // Tab et x sont des parametres formels
        for(int i=0; i<Tab.length; i++){
            if(Tab[i] == x)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        Random rand = new Random();
        int[] T1 = new int[5];
        for(int i=0; i<5; i++){
            T1[i] = rand.nextInt(20);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre:");
        int num = sc.nextInt();

        boolean result = recherche(T1, num); //T1 et num sont des parametres effectifs

        if(result){
            System.out.println("L'element "+num+" est dans le tableau");
        }else{
            System.out.println("L'element "+num+" n'est pas dans le tableau");
        }
    }

}