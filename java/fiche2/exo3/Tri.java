public class Tri{
    public static void main(String[] args){
        int Tab[] = {11, 3, 9, 6, 15};
        System.out.println("Affichage avant tri:");
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i]+" | ");
        }
        System.out.println(" ");

        for(int i=0; i<Tab.length; i++){
            int min = MinMax.indiceMin(Tab, i);
            
            int temp = Tab[i];
            Tab[i] = Tab[min];
            Tab[min] = temp; 
        }

        System.out.println("Tableau trie: ");
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i]+" | ");
        }
    }
}