import java.util.Arrays;

public class function6 {
     //Fonction qui fusionne deux tableaux
    public static int[] fusionTableau(int[] tab1, int[] tab2) {

        int[] tabFusion = new int[tab1.length + tab2.length];
        
        //copie du premier tableau dans le tableau tabfusion
        for (int index = 0; index < tab1.length; index++) {
            tabFusion[index] = tab1[index];
        }
        //copie du deuxieme tableau dans tabfusion en commencant a la fin du premier tableau
        for (int index = 0; index < tab2.length; index++) {
            tabFusion[tab1.length+index] = tab2[index];
        }

        return tabFusion;

        
    }
        public static void main(String[] args) {
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {10,20,30,40};
        int[] tabfusion = fusionTableau(tab1,tab2);
        
        for(int x:tabfusion){ //autre maniere de parcourir les elements d'un tableau
            System.out.println(x);
        }
        
        }

    public static void copyTab(int[] tab1,int[] tab2){

        int[] tab3 = tab2; //les deux tableaux pointent vers la meme reference

        //le tab3 recoit une copie du tab2 dont si tab2 est modifie tab3 ne sera pas modifie et inversement
        for (int i = 0; i < tab2.length; i++) {
            tab3[i] = tab2[i]; 
        }

        //deuxieme facon de copier
        tab3=tab2.clone();

        //troisieme facon de copier
        tab3 = Arrays.copyOf(tab2,tab2.length);

}

}

//tab1 = {1,2,3,4};
//ab2 = {10,20,30,40};

// la taille du tabfusion = 8;

//execution de la premiere boucle for : tabfusion = {1,2,3,4};

//execution de la deuxieme boucle for en comment a la fin du premiere tableau : tabfusion = {1,2,3,4,10,20,30,40}

