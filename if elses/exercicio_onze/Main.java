package exercicio_onze;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int A,B;
        
        
     
      
        
        
        System.out.println("digite um numero:");
        A = sc.nextInt();
        
        System.out.println("digite um numero:");
        B = sc.nextInt();
        
        
       if(A % B ==0|| B % A==0) {
    	   System.out.println("sao multiplos");
    	   
    	   
       }else {
    	   System.out.println("nao sao multiplos");
    	   
    	   
       }
        
        
        
        
        
        
        
        
        sc.close();
	}

}
