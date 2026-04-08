public class Exception1{
    static int division(int[] tab, int i, int diviseur) throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException{
        if(diviseur == 0){
            throw new ArithmeticException("Erreur! Division par zero");
        }

        if(i<0 || i>tab.length){
            throw new ArrayIndexOutOfBoundsException("Indice hors limites!");
        }

        if(tab == null || tab[i] == null){
            throw new NullPointerException("Element du tableau null !");
        }

        return tab[i]/diviseur;
    }

    public static void main(String[] args){
        int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
        int x, y;

        try{
            System.out.println("Entrez l'indice de l'entier a diviser: ");
            x = Integer.parseInt(System.console().readLine());
            System.out.println("Entrez le diviseur: ");
            y = Integer.parseInt(System.console().readLine());
            System.out.println("Le résultat de la division est: ");
            System.out.println(division(tableau, x, y));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erreur d'indice: "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Erreur de pointeur null: "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Erreur arithmetique: "+e.getMessage());
        }finally{
            // instructions
        }
    }
}