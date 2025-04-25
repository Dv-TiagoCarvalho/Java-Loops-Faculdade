import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
       int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        int soma=0;
            

        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];
                   
    
        }
        
        System.out.println("Soma total = "+ soma);
        scanner.close();



    }
}
