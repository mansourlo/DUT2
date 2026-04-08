import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your name:");
        char nom = sc.next().charAt(0);
        IO.println("Your name is: " + nom);
    }
}