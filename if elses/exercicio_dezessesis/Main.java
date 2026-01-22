package exercicio_dezessesis;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       
       
      double n1,n2,n3;
      double md;
      
      
       
       
       
      System.out.println("digite sua nota p1");
       n1 = sc.nextDouble();
       System.out.println("digite sua segunda nota p2");
       n2 = sc.nextDouble();
       System.out.println("digite a nota da p3");
       n3 = sc.nextDouble();
       
       
   if(n1<n2) {
	   md = (n2+n3)/2;
	   
   }else {
	   md = (n1+n3)/2;
	   
	   
   }
    System.out.printf("sua media aqui: %.2f%n", md );   
       
       
    if(md>=6) {
    	System.out.println("aprovado");
    	
    }else if(md<5) {
    	System.out.println("reprovado");
    	
    	
    }
       
       sc.close();
	}

}
