package exercicio_while3;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        
  int alcoon = 0;
  int gasolina = 0;
  int diesel = 0;
  
  int tipo =sc.nextInt();      
        
  while(tipo !=0) {
	  if(tipo == 1) {
        alcoon = alcoon +1;
        
		  
		  
		  
		  
		  
		  
		  
		  
	  }else if(tipo==2) {
		  gasolina = gasolina +1;
		  
		  
		  
	  }else if(tipo ==3) {
		       diesel = diesel + 1;
		  
		  
	  }else {
		 System.out.println("informe o numero certo"); 
		  
		  
		  
	  }
	   tipo =sc.nextInt();
	 System.out.println("parcial"); 
	  System.out.println("alcoon"+ alcoon);
	  System.out.println("gasolina"+ gasolina);
	  System.out.println("diesel"+diesel);
	  
	  
	  
  }
        
  System.out.println("muito obrigado");  
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
	}

}
