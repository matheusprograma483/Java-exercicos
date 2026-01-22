package exercicio_cinco;
import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
      int A,B,C,D,valor;
             
      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();
      D = sc.nextInt();
      valor = (A*B-C*D);
      
      System.out.println("Diferença = " + valor);     
      
      
      
      sc.close();
	}

}
