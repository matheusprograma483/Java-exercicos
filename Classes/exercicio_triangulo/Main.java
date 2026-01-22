package exercicio_triangulo;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
      
        Triangle x,y;
         x =new Triangle();
         y =new Triangle();
        System.out.println("digite a area do X ");
        x.a=sc.nextDouble();
        x.b =sc.nextDouble();
        x.c=sc.nextDouble();
      
       System.out.println("digite a area do y ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();
       
        
   
      double areax = x.area();
        
        
      
      double areaY = y.area();
        
      System.out.printf("medida do X: %.4f%n  ", areax);  
      System.out.printf("medida do Y: %.4f%n  ", areaY);   
        
      
      if(areax>areaY) {
    	  System.out.println("X");
    	  
    	  
      }else {
    	  System.out.println("Y");
    	  
    	  
      }
        
        sc.close();
        
        
        
	}

}
