/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class senhaCorreta {

    public static void main(String[] args) {
        int senha = 1;
        Scanner leia = new Scanner(System.in);
        
        while(senha != 1234){
            System.out.println("Digite a senha certa");
            senha = leia.nextInt();
        }
    }
}