import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

      int senha = 123;
      int contador = senha;

     System.out.println("Digite a senha");
     senha = scanner.nextInt();

      while (senha!=contador) {
        
        System.out.println("Senha incorreta, tente novamente.");
        senha = scanner.nextInt();
        
        if (senha==contador) {
            System.out.println("Acesso concedido");
            break;
           
        }
        
      }
      scanner.close();
    }
}
