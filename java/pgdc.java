public class pgdc{
    public static void main(String args[]){
        System.out.println("Le pgdc de 64 et 48 est: " + euclide(3, 20));
    }

    public static int ppmc(int x, int y){
        if(x==0 || y==0) return 0;

        for(int i=1; i<Math.abs(x*y); i++){
            if((i % x == 0) && (i % y == 0)) return i;
        }

        return -1;
    } 

    public static int euclide(int x,  int y){
        if(x == 0) return y;
        if(y == 0) return x;
        if(x<0 || y<0) return -1;
        
        int reste = x % y;

        while(reste != 0){
            x = y;
            y = reste;
            reste = x % y;
        }
        return y;
        
    }

    public static int formule(int x, int y){
        if (x == 0) return y;
        if (y == 0) return x;
        if (x < 0 || y < 0) return -1;

        int ppmc = ppmc(x, y);

        if(ppmc <= 0){
            return -1;
        }else{
            return (x * y) / ppmc;
        }
    }
}