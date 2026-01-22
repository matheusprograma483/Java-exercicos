package exercicio_quatro;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double A,R, t =3.14159;
        
       R =  sc.nextDouble();
       A = t*R*R;
           
      System.out.printf("A=%.4f%n", A); 
       sc.close();
	}

}
