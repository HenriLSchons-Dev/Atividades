/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class protocoloAcesso {

    public static void main(String[] args) {
        boolean cartao, biometria, adm;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("O usuario possui o cartao da empresa?");
        cartao = leia.nextBoolean();
        
        System.out.println("O usuario possui a biometria valida?");
        biometria = leia.nextBoolean();
        
        System.out.println("O usuario é um administrdor?");
        adm = leia.nextBoolean();
        
        if(cartao == true && biometria == true){
            System.out.println("Acesso nivel A liberado");
        }
        else if(cartao == true || biometria == true && adm == true){
            System.out.println("Acesso nivel B liberado");
        }
        else {
            System.out.println("Acesso negado");
        }
    }
}