/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos;

/**
 *
 * @author Windows 10
 */
public class estudos {
 public String nome;
 public double nota;
 public double nota2;
 public double nota3;
 public double soma;
 
 
 
 
 
 
 
public double somadasnotas(){
return soma =(nota+nota2+nota3);


}
public void passou(){
 
         if(soma>=60){
          System.out.println("passou " + soma);
         
         }else{
           System.out.println("nao passou faltou " +soma );
         
         }


} public String mostrar(){
  somadasnotas();
   passou();
   return "aluno " + nome +
           "\nsoma " + soma;

}

   


 
}


