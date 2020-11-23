/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
      int contador = 1;
      String jugador;
      String cadenafinal = "";
      double puntos;
      double faltas;
      
        while (contador <= 10 ) {            
        System.out.println("Ingresar el nombre del jugador: ");
        jugador = entrada.nextLine();   
        System.out.println("Ingresar la cantidad de puntos que anotó en "
                + "la temporada: ");
        puntos = entrada.nextDouble();  
        System.out.println("Ingresar la cantidad de faltas de la temporada:");
        faltas = entrada.nextDouble();
        cadenafinal = String.format("%s%s\t%f\t%f\n",
        cadenafinal,
        jugador,
        puntos,
        faltas);
       contador = contador + 1;
       entrada.nextLine();
        }
       System.out.printf("%s\n", cadenafinal);
    }
    
}

