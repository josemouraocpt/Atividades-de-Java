package techinoracle;
import java.util.Scanner;

public class TechInOracle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //instacia e abre o scanner
        
        System.out.print("Qual o seu nome? ");        
        String nome = sc.next(); //captura o valor inserido como uma string
        
        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt(); //captura o valor inserido como um int
        
        
        System.out.println("Agora digite quatro numeros inteiros: ");
        int numInt1 = sc.nextInt(); //recebe o proximo valor inserido como um int
        int numInt2 = sc.nextInt(); //recebe o proximo valor inserido como um int
        int numInt3 = sc.nextInt(); //recebe o proximo valor inserido como um int
        int numInt4 = sc.nextInt(); //recebe o proximo valor inserido como um int
        int totInt = numInt1 + numInt2 + numInt3 + numInt4; //realiza a soma dos valores
        double mediaInt = totInt / 4.0; //calcula a média do valores inseridos
        
        System.out.println("Agora digite quatro numeros de ponto flutuante: ");
        double numDouble1 = sc.nextDouble(); //recebe o proximo valor inserido como um double
        double numDouble2 = sc.nextDouble(); //recebe o proximo valor inserido como um double
        double numDouble3 = sc.nextDouble(); //recebe o proximo valor inserido como um double
        double numDouble4 = sc.nextDouble(); //recebe o proximo valor inserido como um double
        double totDouble = numDouble1 + numDouble2 + numDouble3 + numDouble4; //realiza a soma dos valores
        double mediaDouble  = totDouble / 4.0; //calcula a média do valores inseridos
        
        sc.close(); //fecha o scanner
        
        //São feitos os print da insformações inseridas
        System.out.println("Ola, "+nome+" seja muito bem-vindo");
        System.out.println("Segundo os nossos dados você possui "+idade+" anos.");
        System.out.println("A soma dos numeros inteiros que você digitou é " + totInt);
        System.out.println("A media dos numeros inteiros que você digitou é " + mediaInt);
        System.out.println("A soma dos numeros de ponto flutuante que você digitou é " + totDouble);
        System.out.println("A media dos numeros de ponto flutuante que você digitou é " + mediaDouble);
        System.out.println("Obrigado por usar o meu programa!!! :)");
        
    }
    
}
