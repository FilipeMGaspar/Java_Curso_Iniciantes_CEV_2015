/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author user
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa!");
        int s = soma(7, 5);
        System.out.println("O valor da soma é "+ s);
    }
    
}
