import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       int contador = 0;
       

       while (true) {
        System.out.println("Digite um Número (Digite um numero negativo para encerrar o Loop)" );
        int numero = entrada.nextInt();

        if (numero>=0) {
            contador+= numero;
            
        }

        if (numero<=0) {
            break;    
        }
  
       }
       System.out.println("Total Acumulado: " + contador); 
       entrada.close();
    
    } 
}
