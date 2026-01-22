package exercicio_oito;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner (System.in);
         
         
         Double A = sc.nextDouble();
         Double B = sc.nextDouble();
         Double C = sc.nextDouble();
         
         
        Double triangulo = (A * C )/2.0;
        Double circulo = 3.14159 * C *C;
        Double  trapezio = ((A+B)*C)/2.0;
        Double quadrado = B*B;
        Double retangulo =A*B;
        
         
     System.out.printf("Triangulo : %.3f%n", triangulo );    
     System.out.printf("circulo : %.3f%n",circulo );    
     System.out.printf("TRAPEZIO : %.3f%n", trapezio);   
     System.out.printf("QUADRADO : %.3f%n",quadrado );
     System.out.printf("RETANGULO : %.3f%n", retangulo );
     
     
     
     
     
        sc.close();
	}

}
