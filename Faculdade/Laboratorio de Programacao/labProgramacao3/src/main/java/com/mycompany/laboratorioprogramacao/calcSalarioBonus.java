/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class calcSalarioBonus {

    public static void main(String[] args) {
        double salario, bonus;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o salario do funcionario?");
        salario = leia.nextDouble();
        
        if(salario > 5000){
            bonus = salario * 1.15;
            System.out.println("O salario desse funcionario mais um bonus de 15% é de: " + bonus);
        }
        else if(salario > 2000){
            bonus = salario * 1.10;
            System.out.println("O salario desse funcionario mais um bonus de 10% é de: " + bonus);
        }
        else {
            bonus = salario * 1.05;
            System.out.println("O salario desse funcionario mais um bonus de 5% é de: " + bonus);
        }
    } 
}
