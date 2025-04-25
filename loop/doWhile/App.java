import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       
        
      int numero;
        
        
        do {  
        System.out.println("Digite um número entre 1 e 100.");
        numero = scanner.nextInt();

            if (numero<1 || numero>100) {
                System.out.println("numero invalido: " + numero);
                
            }
            

        } while (numero<1 || numero>100);

        System.out.println("Numero valido: "+ numero);
        scanner.close();

    }
}
