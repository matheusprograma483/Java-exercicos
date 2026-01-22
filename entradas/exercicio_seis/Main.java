package exercicio_seis;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Locale.setDefault(Locale.US);
         
         Scanner sc = new Scanner(System.in);
         
         int numero;
         double horas_trabalhada,horas_pagas,total;
         
         numero = sc.nextInt();
         horas_trabalhada = sc.nextDouble();
         horas_pagas = sc.nextDouble();
         total =  horas_trabalhada*horas_pagas;
         
         System.out.println("NUMBER = " + numero );
         System.out.printf("SALARY = U$ %.2f%n " , total);
         
         sc.close();
	}

}
