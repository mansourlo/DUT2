public class Fusion{
    public static int[] fusionTab(int[] T1, int[] T2){
        int m = T1.length + T2.length;
        int[] Tab = new int[m];

        for(int i=0; i<T1.length; i++)
            Tab[i] = T1[i];
        
        for(int i=0; i<T2.length; i++)
            Tab[i+T1.length] = T2[i];

        System.out.println("Nouveau tableau obtenu:");
        //for(int i=0; i<m; i++)
           // System.out.print(Tab[i]+" | ");
        return Tab[];
    }

    public static void main(String[] args){
        int T1[] = {2, 5, 10, 7};
        int T2[] = {4, 1, 9, 5, 3};

        fusionTab(T1, T2);
    }
}