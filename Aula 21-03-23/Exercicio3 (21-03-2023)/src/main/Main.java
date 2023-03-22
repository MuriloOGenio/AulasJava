
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int alun = 0;
        int idade = 0;
        int media = 0; 
        while(alun <=10){
            alun++;
            System.out.print("Digite a idade do aluno " + alun+ ": ");
            idade += grava.nextInt();
            

            
        }
        media = idade / alun;
        System.out.println("A média de alunos é: " + media);
    
}}
