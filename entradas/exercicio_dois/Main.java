package exercicio_dois;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        String x;
        int y;
        double z;
        x = sc.next();
        y =sc.nextInt();
        z =sc.nextDouble();
       System.out.println("dados digitados:");
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
        sc.close();
	}

}
