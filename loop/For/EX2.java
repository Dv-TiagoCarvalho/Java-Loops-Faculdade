import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite um numero (calculo fatorial)");
        int fatorial = scanner.nextInt();
        
       
       
       if (fatorial<0) { 

       System.out.println("Numero inválido"); 
        
            } else {

        long numero=1;
         
        for (int i = 1; i <= fatorial; i++) { 
            numero*= i;
        
         
         }
        System.out.println(" o fatorial de "+ fatorial +" = "+ numero);
       scanner.close();

        }
      
    }
}
