package exercicio_while1;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       
       int senha =sc.nextInt();
       
       while(senha!=2002) {
    	  System.out.println("senha invalida"); 
    	  senha =sc.nextInt();
    	   
    	   
       }
       System.out.println("acesso permitido");
       
       
       
       
       sc.close();
	}

}
