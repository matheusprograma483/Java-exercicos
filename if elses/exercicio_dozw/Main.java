package exercicio_dozw;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          
          int hora_incial,hora_final,duracao;
          
          
         System.out.println("digite a hora incial do jogo:");
         hora_incial = sc.nextInt();
         
         System.out.println("digite o segundo tempo");
         hora_final = sc.nextInt();
         
         
         duracao =(hora_final -  hora_incial + 24)% 24;
          if(duracao == 0) {
        	  duracao = 24;
        	  
        	  
        	  
          }
          
          
          System.out.println("o jogo durou "  +  duracao  +  " horas ") ; 
         sc.close();
	}

}
