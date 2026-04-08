public class Reste{
    public static void main(String args[]){
        int result = reste(-11, 7);
        System.out.println("Le reste de la division est: " + result);
        //System.out.println("reste avec %: " + -11%7);
    }

    //fonction reste avec des nombres entiers
    public static int reste(int n, int p){
        if(p == 0) return -1;
        //if(n < 0 || p < 0) return -1;

        int a = Math.abs(n);
        int b = Math.abs(p);
        
        while(a >= b){
            a -= b;
        }
        
        if(n < 0 && p < 0){
            return a;
        }else if(n < 0 || p < 0){
            return -a;
        }else{
            return a;
        }
    }
}