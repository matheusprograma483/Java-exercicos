/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos;
import java.util.Scanner;
import java.util.Locale;/**
 *
 * @author Windows 10
 */
public class exercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in); 
          int number;
  
          System.out.println("digite um numero de um a 10");
           number=sc.nextInt();
           System.out.println("resultado do numero: " + number );
        sc.close();
    }
}
