public class Tri2{
    public static void fonctionTri(int[] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<(tab.length-1); j++){
                if(tab[j+1] < tab[j]){
                    int temp = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] Tab = {11, 3, 9, 6, 15};

        fonctionTri(Tab);

        System.out.println("Tableau trie: ");
        for(int i=0; i<Tab.length; i++){
            System.out.print(Tab[i]+" | ");
        }
    }
}