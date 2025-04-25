import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random adivinhação = new Random();

        int sorteio;
        int contador=0;
        int tentativa;
        int limite =20; 
        sorteio = adivinhação.nextInt(limite);

        do {

             contador++;
             System.out.println("Advinhe o numero:  ");
             tentativa = scanner.nextInt();
            
            

             if (tentativa<sorteio) {
                System.out.println("Numero digitado é menor que o valor sorteado \n");
                
             } else if(tentativa>sorteio) {
                System.out.println("Numero digitado é maior que o valor sorteado \n");
                  
                
             }

        } while (sorteio!=tentativa);
        System.out.println("Parabéns você acertou");
        System.out.println("Numero de tentativas = " + contador);
        scanner.close();
    }
}
