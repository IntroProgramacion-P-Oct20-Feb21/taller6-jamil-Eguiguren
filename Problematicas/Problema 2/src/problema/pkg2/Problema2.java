/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        int  contador1 = 1;
        int  contador2 = 10;
        int  contador3 = 20;
        while (contador1 <= 6) {            
            if ((contador1 % 2) == 0){
           System.out.println(contador1 + "/" + contador3);
            contador3 = contador3 + 1;
            }else{
            System.out.println(contador1 + "/" + contador2);
             contador2 = contador2 + 1;
                  
            }
          contador1 = contador1 + 1;   
        }
   
    }
    
}
