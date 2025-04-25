import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        int adicionar=1;
        int removedor=2;
        int sair=3;
        int escolha;

        do {
            
            System.out.println("Escolha uma opção");
            System.out.println("OPÇÃO 1 = Adicionar " );
            System.out.println("OPÇÃO 2 = Remover");
            System.out.println("OPÇÃO 3 = Sair\n");
            System.out.println("Digite o numero da opção escolhida: " + "");
            escolha = scanner.nextInt();

            if (escolha==adicionar || escolha == removedor) {
                System.out.println("Ação Realizada\n");

            }else if (escolha==sair) {
                    System.out.println("Opção " + sair + " executada" );{ 

                    
                }
                
            }

        } while (escolha != sair);
        scanner.close();
           
    }
}
