/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique a sua data de nascimento: ");
        int nas = teclado.nextInt();
        int idade = 2020 - nas;
        System.out.print("Você tem " + idade+ " anos, você é ");
        if(idade>=18){
            System.out.println("maior de idade!");
        }else{
            System.out.println("menor de idade!");
        }
    }
    
}
