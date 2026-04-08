public class CalculatriceSimple{
    public static void main(String args[]){
       if(args.length == 0){ 
            System.out.println("Aucun argument fourni!");
            return;
        }

       float a = Float.parseFloat(args[0]), b = Float.parseFloat(args[2]), res;

        switch(args[1]){
            case "+": 
                res = a + b;
                break;
            case "-": 
                res = a - b;
                break;
            case "x": 
                res = a * b;
                break;
            case "/": 
                if (b == 0) {
                    System.out.println("Erreur : division par zéro !");
                    return;
                }else res = a / b;
                break;
            default:
                System.out.println("Opérateur invalide. Utilisez +  -  *  /");
                return;
        }
        System.out.println(a + " " + args[1] + " " + b + " = " + res);
    }
}