package com.mycompany.labprogramacao4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class senhaCorreta {

    public static void main(String[] args) {
        int senha = 0;
        Scanner leia = new Scanner(System.in);
        
        while(senha != 1234){
            System.out.println("Digite uma senha de 4 digitos: ");
            senha = leia.nextInt();
        }
        System.out.println("Acesso liberado!");
    }
}
