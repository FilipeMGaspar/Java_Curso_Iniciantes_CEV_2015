/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 1, 9, 4, 2};
        for(int valor: vet){
            System.out.print(valor +" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8);// pesquisa no vetor "vet" pelo valor 1
        System.out.println("Encontrei o valor na posição: " + p);
    }
    
}
