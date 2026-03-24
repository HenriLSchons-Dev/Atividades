/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class verificacaoTringulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado do triangulo: ");
        lado1 = leia.nextDouble();
        
        System.out.println("Digite o segundo lado do triangulo: ");
        lado2 = leia.nextDouble();
        
        System.out.println("Digite o tericeiro lado do triangulo: ");
        lado3 = leia.nextDouble();
        
        if(lado1 == lado2){
            if(lado2 == lado3)
            System.out.println("Triangulo equilatero");
        }
        else if(lado1 == lado2){
            System.out.println("Triangulo isoceles");
        }
        else if(lado2 == lado3){
            System.out.println("Triangulo isoceles");
        }
        else {
            System.out.println("Triangulo escaleno");
        }
    }
    
}
