/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author user
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 20;
        String valor = Integer.toString(idade);
        System.out.println("Idade "+ valor +" anos");
        
        String anos = "30";
        int aSuaIdade = Integer.parseInt(anos);
        
        System.out.println("A sua idade "+ aSuaIdade);
        
        String peso = "61.2";
        float pesado = Float.parseFloat(peso);
        System.out.println("O seu peso é "+pesado);
    }
    
}
