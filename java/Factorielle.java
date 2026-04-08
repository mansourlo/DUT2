public class Factorielle{
    
    public static void main(String args[]){
       /* if(args.length == 0){ 
            System.out.println("Aucun argument fourni!");
            return;
        }

        long res = 1; int num = Integer.parseInt(args[0]);

        if(num < 0){
            System.out.println("Donnez un nombre positif");
        }else{
            while (num >= 1){
                res = res * num;
                num--;
            }
            System.out.println(args[0] + "! = " + res);

        }*/

       System.out.println("Le factorielle est: " + factorielle(6));
    }

    public static int factorielle(int x){
        int facto = 1;

        if(x < 0){
            return -1;
        }else{
            while (x >= 1){
                facto *= x;
                x--;
            }
            return facto;
        }
    }
}