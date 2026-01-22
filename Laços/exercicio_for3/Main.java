package exercicio_for3;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Locale.setDefault(Locale.US);
         Scanner sc= new Scanner(System.in);
         
         
         
      int n=sc.nextInt();
      
      for(int i=0;i<n;i++) {
    	double a=sc.nextDouble();
    	double b=sc.nextDouble();
    	double c=sc.nextDouble();
    	 double media=0;
    	media=(a*2+ b*3+ c *5)/10.0;  
    	  
    	System.out.println("media ponderada " +  media );   
    	  
      }
         
         
      
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         sc.close();
	}

}
