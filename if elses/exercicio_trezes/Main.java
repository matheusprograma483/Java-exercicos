package exercicio_trezes;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         int codigo = sc.nextInt();
         int quantidade = sc.nextInt();
         
         
       
         double total= 0.0;
         
       if(codigo==1) {
    	 total = quantidade *4.00;  
    	   
    	   
       }else if(codigo==2) {
    	   total = quantidade *4.50;
    	   
    	   
       }else if(codigo==3) {
    	   total = quantidade *5.00;
    	   
    	   
       }else if(codigo==4) {
               total = quantidade *2.00;
               
     	   
    	   
       }else if(codigo == 5) {
    	  total = quantidade *1.50; 
    	   
    	   
       }else {
    	   System.out.println("numero errado otario");
    	   sc.close();
    	   return;
       }
         
         
       System.out.printf("aqui esta seu pedido R$ %.2f%n ", total);  
         
         
         
         sc.close();
	}

}
