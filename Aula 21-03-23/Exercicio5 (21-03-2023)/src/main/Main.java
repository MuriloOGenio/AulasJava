
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
    Scanner grava = new Scanner (System.in);
     int valor = 1;
     int soma = 0;
     while(valor <=5){
           
     soma = soma += valor;
     valor++;      
    }
     System.out.println(soma);
}}
