package exercicio_dez;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int number;
        
        System.out.println("digite um numero:");
        number =sc.nextInt();
        
        	
      if(number % 2==0) {
    	  System.out.println("numero é par "+ number);
    	  
    	  
    	  
    	  
      }else {
    	  System.out.println("impar "+ number);
    		  
    		  
    	  
      }
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
	}

}
