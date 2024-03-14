/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Resumo: Você digitará um número para quantidade de número que o programa irá usar para fazer a média

ENTRADA
3
6.5 
4.3
6.2
      
SAIDA
5.7
 */

package com.mycompany.ex3for;

import java.util.Scanner;

public class Ex3For {

    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);
    
       System.out.println("Digite a quantidade das notas: \n");
        
        int n = teclado.nextInt();
        double soma = 0;
        double nota;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a nota: " + i + ": ");
            nota = teclado.nextDouble();
            soma += nota;
        }
        double media = soma / n;
        System.out.printf("A média do aluno é: %.1f",media);

        teclado.close();
    }        
}
       
   
        


