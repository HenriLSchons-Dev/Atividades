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
public class promocaoLoja {

    public static void main(String[] args) {
        double desconto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor da compra?");
        double compra = leia.nextDouble();
        
        if(compra > 200.0){
            desconto = compra - (compra * 0.10);
            System.out.println("O valor total da compra foi de: " + desconto);
        }else{
            System.out.println("O valor total da compra foi de: " + compra);
        }
    }
}
