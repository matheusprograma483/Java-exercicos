
package exercicio;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		  Locale.setDefault(Locale.US);
	
	String nome = "maria";
	int idade = 31;
	double renda = 4000.0;
	double x = 10.35784;
	
	
	    System.out.println(x);
        System.out.printf("%.2f\n", x);  
        System.out.printf("%.4f\n", x); 
        System.out.println("Resultado ="+ x +" METROS");
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n",nome,idade,renda );
	}

}
