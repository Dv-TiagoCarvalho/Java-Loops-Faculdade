import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean calculardnv = true;

        while (calculardnv) {
            System.out.println("O valor do investimento inicial ( P );");
            double p = scanner.nextDouble();

            System.out.println("A taxa de juros anual ( r );");
            double juros = scanner.nextDouble();

            System.out.println("O período de investimento em anos ( t );");
            double t = scanner.nextDouble();
            
            System.out.println("A opção de capitalização (simples ou composta). ");
            String cp = scanner.next().toLowerCase();

            double montante=0;

            if (cp.equals("simples")) {
                montante = p * (1+juros/100) * t;

                
            } else if (cp.equals("composta")){
                montante = p * Math.pow(1+(juros/100), t);
 
                } else {

                    System.out.println("Opção de capitalização inválida!"); 
                    continue;          
            }
            System.out.println("Resultado");
            System.out.printf("Valor Inicial (P):R$ %.2f%n",p);
            System.out.printf("Taxa de Juros Anual (r): %.2f%%%n",juros);
            System.out.println("Período de Investimento (t): "+ t +"anos");
            System.out.println("Tipo de Capitalização: " + cp);
            System.out.printf("Montante Final (M): R$ %.2f%n", montante);

            System.out.print("\nDeseja realizar outro cálculo? (sim/não): ");
            String resposta = scanner.next().toLowerCase();
            calculardnv = resposta.equals("sim");
        }

        System.out.println("\n calculadora de rendimento finalizada");
        scanner.close();

    }
}
