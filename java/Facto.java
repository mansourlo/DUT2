public class Facto {

    // Fonction qui calcule la factorielle
    public static int factorielle(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }
    // * Recursivité
    public static int factoRec (int n) {
        if (n==0 || n== 1) return 1;
        else if (n>0)return n*factoRec(-1);
        else return -1;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Veuillez fournir un nombre en argument.");
            return; 
        }
        int n = Integer.parseInt(args[0]); // 1st arg
        if (n < 0) {
            System.out.println("Veuillez saisir un nombre positif\n");
            return;
        }
        // 2eme methode sans fonction 
        int i=1 ;
        int facto = 1;

        while (i<=n) {
            facto *= i;
            i++;
        }
        System.out.println("La factorielle de " + n + " est : " + facto);
    }
}
