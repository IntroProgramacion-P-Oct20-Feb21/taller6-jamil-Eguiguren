/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        String nombre;
        double netflix= 10;
        double disney= 6;
        double apple= 5;
        double amazon= 4.5;
        int mensualidades;
        int numero;
        String resultadofinal = "";
        
        System.out.println("Ingrese su nombre: ");
        nombre= entrada.nextLine();
        System.out.println("indique el numero de mensualidades "
                + "(ingrese minimo 2):  ");
        mensualidades= entrada.nextInt();
        
        if (mensualidades >= 2 ) {
        System.out.println("indique que servicio de stream decea\n"
                + "Ingresar 1 para escoger netflix\n"
                + "Ingresar 2 para escoger disney\n"
                + "Ingresar 3 para escoger apple\n"
                + "Ingresar 4 para escoger amazon\n");
        numero = entrada.nextInt();
        
       double me_netflix = mensualidades * netflix;
       double me_disney = mensualidades * disney;
       double me_apple = mensualidades * apple;
       double me_amazon = mensualidades * amazon;
       double iva_netflix = me_netflix * 0.1;
       double iva_disney = me_disney * 0.12;
       double iva_apple = me_apple * 0.14; 
       double iva_amazon = me_amazon * 0.16;   
       double total_netflix = iva_netflix + me_netflix;
       double total_disney = iva_disney + me_disney;
       double total_apple = iva_apple + me_apple; 
       double total_amazon = iva_amazon + me_amazon;   
       
       switch (numero){
        case 1: 
               resultadofinal = String.format("Usuario:%s\n"
               +"Empresa: Netflix\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,
               netflix,
               iva_netflix,
               total_netflix);
          break;
        case 2: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: disney\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,
               disney,
               iva_disney,
               total_disney);
          break;   
          
        case 3: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: apple\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,
               apple,
               iva_apple,
               total_apple);
          break;   
         case 4: 
               resultadofinal= String.format("Usuario:%s\n"
               +"Empresa: amazon\n"
               + "Precio base: $%.2f\n"
               +"Impuesto: $%.2f\n"
               +"Total a cancelar: $%.2f\n",
               nombre,
               amazon,
               iva_amazon,
               total_amazon);
          break;              
           
           }
       }else{
    resultadofinal = String.format("%sDatos erroneos\n",resultadofinal);         
       }
    System.out.printf("%s\n", resultadofinal);
      }
}
    

