import java.util.Scanner;
import java.text.NumberFormat;
import java.util.*; //InputMismatchException;

public class prog3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le 1er nbr: ");
        float nb1 = sc.nextFloat();

        System.out.println("Donner le 2e nbr: ");
        float nb2 = sc.nextFloat();

        System.out.println("Donner le 3e nbr: ");
        float nb3 = sc.nextFloat();

        double moy = (nb1 + nb2 + nb3)/3;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        try{
            System.out.printf("Moyenne arithmetique = %.3f", moy /*currencyFormat.format(moy)*/);
        }catch(Exception e){
            System.out.println("Entree incorrecte ! saisissez encore: ");
            sc.nextFloat();
        }
    }
}