public class Comparaison{
    public static boolean compareChaine (String s1, String s2){
        boolean eq = (s1.length() == s2.length());

        int i = 0;
        while(eq && i<s1.length()){
            eq = (s1.charAt(i) == s2.charAt(i));
            i++;
        }
        return eq;
    }

    public static void main(String[] args){
        String str1 = "Bonjour", str2 = "Bonjour";

        boolean result = compareChaine(str1, str2);

        if(result)
            System.out.println("Memes chaines");
        else
            System.out.println("Chaines differentes !");
    }
}