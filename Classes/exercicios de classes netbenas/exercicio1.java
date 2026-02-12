/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class exercicio1 {
   public static void main(String[]args){
   Locale.setDefault(Locale.US);
   Scanner sc = new Scanner(System.in);
   estudos e = new estudos();
   //aqui eu pego os dados
   System.out.println("digite seu nome:");
   e.nome=sc.nextLine();
   System.out.println("digite sua primeira nota");
   e.nota=sc.nextDouble();
   System.out.println("digite sua segunda nota");
   e.nota2=sc.nextDouble();
   System.out.println("digite sua terceira nota");
   e.nota3=sc.nextDouble();
   //aqui eu chamo a classe
   e.somadasnotas();
   e.passou();
   
     System.out.println(e.mostrar());
   
   
  sc.close(); 
   } 
}
