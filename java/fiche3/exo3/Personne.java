import java.util.Scanner;
public class Personne{
    private int age;

    public Personne(int age) throws NegativeAgeException{
        if(age<0 || age>100){
            throw new NegativeAgeException(age);
        }else{
            this.age = age;
        }

    }

    public void setAge(int age)throws NegativeAgeException{
        if(age<=0 || age>100){
            throw new NegativeAgeException(age);
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public static void verifierAge(int age) throws NegativeAgeException{
        if(age<0){
            throw new NegativeAgeException("Erreur: l'age saisi doit etre positif");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'age: ");
        int age = scanner.nextInt();
        
        try{
            Personne p = new Personne(age);
            System.out.println("Age enregistre: "+p.getAge());
        }catch(NegativeAgeException e){
           System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}