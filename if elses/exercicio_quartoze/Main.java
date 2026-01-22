package exercicio_quartoze;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        
        if(numero <0.0 || numero > 100.0) {
        	System.out.println("fora de intervalor");
        	
        	
        	
        }else if(numero <=25) {
        	System.out.println("intervalor do [0,25]");
        	
        	
        }else if(numero <=50) {
        	System.out.println("intervalor dos [25,50]");
        	
        	
        }else if(numero <=75) {
        	System.out.println("intervalor dos [50,75]");
        	
        	
        	
        }else if(numero <=100) {
        	System.out.println("intevalor dos [75,100]"); {
        		
        		
        		
        	}
        	
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
	}

}
