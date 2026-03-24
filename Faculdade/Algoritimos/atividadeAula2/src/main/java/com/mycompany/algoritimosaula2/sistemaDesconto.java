/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimosaula2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class sistemaDesconto {

    public static void main(String[] args) {
        double desconto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor da sua compra?");
        double compra = leia.nextDouble();
        
        if(compra > 200){
            
            if(compra >= 500){
                desconto = compra - (compra * 0.20);
                System.out.println("O valor final da sua compra e igual a: " + desconto);
            }else{
                desconto = compra - (compra * 0.10);
                System.out.println("O valor final da sua compra e igual a: " + desconto);
            }
            
        }else{
            System.out.println("O valor final da sua compra e igual a: " + compra);
        }
        
    }
}