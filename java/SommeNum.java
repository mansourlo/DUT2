import java.util.Scanner;
public class SommeNum{
    public static void main(String[] args){
       /* String str1 = args[0].substring(1);
        String str2 = args[1].substring(1);

        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);

        long somme = num1 + num2;
        System.out.println("La somme des deux N° est: " + somme);*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Votre prenom:");
        int age = sc.nextInt();
        System.out.println("Vous avez " + age + " ans.");
    }
}