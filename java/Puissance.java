public class Puissance{
    public static void main(String args[]){
        System.out.println("2^3 = " + puissance(2, 4));
    }

    //La fonction puissance est definie pour tout x appartenant à R et  pour tout n appartenant à Z
    public static double puissance(int x, int n){
        int result = 1;

        if(n < 0){
            x = 1 / x;
            n = -n;
        }//on pourrait ne pas faire ce traitement et retourner l'inverse du resultat obtenu

        for(int i = 1; i <= n; i++){
            result *= x;
        }
        return result;
    }
}