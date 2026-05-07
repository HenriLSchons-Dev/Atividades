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
public class validarSenha {

    public static void main(String[] args) {
        int senhaCorreta = 2026, tentativas = 0, senha;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.print("Digite a senha: ");
            senha = leia.nextInt();

            if (senha != senhaCorreta) {
                tentativas++;

                if (tentativas == 3) {
                    System.out.println("Sistema bloqueado! Aguarde...");
                    System.out.println("Apenas 1 tentativa por vez.");
                } else {
                    System.out.println("Senha incorreta!");
                }

            }

        } while (senha != senhaCorreta);
        System.out.println("Acesso liberado!");
    }
}