/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        int  contador = 1;
        double promedio;
        String cadenafinal = "";
        String estado;
        String nombre;
        while (contador <= 4) {            
           System.out.println("Ingrese el nombre del estudiante: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el promedio de ciclo: ");
            promedio = entrada.nextDouble(); 
            
            if (promedio >=7){
              estado ="Aprobado" ; 
            }else{
                estado ="Reprobado" ;}
        cadenafinal = String.format("%s%s\t%.2f\t%s\t\n",
        cadenafinal,
        nombre,
        promedio,
        estado);
          contador = contador + 1;   
        entrada.nextLine();
        }
     System.out.printf("%s\n", cadenafinal);
    }
    
}
