package exercicio_tres;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        
       int A,B,soma;
        
       A = sc.nextInt();
       B = sc.nextInt();
       soma = A + B;
       
       System.out.println("SOMA = " + soma);
       
       
      sc.close();  
	}
             
}
