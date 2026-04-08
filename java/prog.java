import java.util.Scanner;
import java.util.InputMismatchException;

public class prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le cote du carre: ");

        int cote = sc.nextInt();

        try{
            int perimetre = cote * 4;
            int surface = cote * cote;

            System.out.println("Perimetre = " + perimetre);
            System.out.println("Surface = " + surface);
        }catch(Exception e){
            System.out.println("Donnez un nombre SVP ");
            sc.nextInt();
            int perimetre = cote * 4;
            int surface = cote * cote;
        }
    }
}