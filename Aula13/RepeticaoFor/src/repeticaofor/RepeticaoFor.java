/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author user
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int cc=1; cc<=4; cc++){//contagem crescente
            System.out.println("Cambalhota "+cc+"!");
        }
        
        for(int cc=15; cc>=5; cc-=2){//contagem decrescente
            System.out.println(cc);
        }
    }
    
    
}
