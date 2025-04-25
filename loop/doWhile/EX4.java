import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int notas;
       int contador=0;
       int media;
       int soma=0;
       String continuar;

       do {

        System.out.println("Digite uma nota (de 0 a 10)");
       notas = scanner.nextInt();
       scanner.nextLine();
       
       if (notas>=0 && notas<=10 ) {

        soma+=notas;
        contador++;
      

       } else{

        System.out.println("Nota inválida! Digite uma nota entre 0 e 10");

       }
        
       System.out.println("Deseja inserir outra nota? (s/n): ");
       continuar = scanner.nextLine();
        
        
       } while (continuar.equalsIgnoreCase("s"));
        media = soma/contador;
        System.out.println("Média: " + media);
        scanner.close();

       

       


        
    }
}
