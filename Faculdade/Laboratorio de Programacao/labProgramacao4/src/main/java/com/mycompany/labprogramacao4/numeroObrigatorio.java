package com.mycompany.labprogramacao4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class numeroObrigatorio {

    public static void main(String[] args) {
        int num = -1;
        Scanner leia = new Scanner(System.in);
        
        while(num < 0){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
        }
        System.out.println("Fim");
    }
}
