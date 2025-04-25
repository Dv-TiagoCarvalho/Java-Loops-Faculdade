public class EX4 {
    public static void main(String[] args) throws Exception {
        int contador = 0;
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);
        
    
        while (contador<8) {
            
         int proximo = num1+num2;
         
         System.out.println(proximo);

         num1=num2;
         num2 = proximo;
         contador++;
      
        


        
            

    
       
            
        }
        
    }
}
