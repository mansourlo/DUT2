public class TestEnum{
    public static void main(String[] args){
        for(EnumSexe sexe:EnumSexe.values()){
            System.out.println("Position "+sexe.ordinal()+": "+sexe);
        }
    }
}