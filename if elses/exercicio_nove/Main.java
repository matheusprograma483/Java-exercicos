package exercicio_nove;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
 
		int number;
		
		
		System.out.println("digite um numero:");
		number =sc.nextInt();
		
		if(number<0) {
			System.out.println("negativo");
			
		}else{
			System.out.println("nao negativo");
			
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
