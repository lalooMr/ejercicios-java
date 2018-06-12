/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calseobjetos;

import java.util.InputMismatchException;
import java.util.Scanner;
import calseobjetos.Cuadrado;
import leer.leer2;
/**
 *
 * @author Mr
 */
public class CalseObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
              
            Cuadrado metodos = new Cuadrado();
             int n =0;
        int op;
        
       do
       {   
        System.out.println("******************************************");  
        System.out.println("*   *M E N U  D E  O P O C I O N E S*    *");
        System.out.println("*  1: Valor de los lados                  *");
        System.out.println("*  2: calcular perimetro                 *");
          System.out.println("* 3: calcular Area                    *");
        System.out.println("*  4: Exit  :                            *");
        System.out.println("******************************************");

        op=leer2.pediriInt();
          switch(op)
                     {
          case 1:
              System.out.print("Elige una opcion del menu :");
              n=leer2.pediriInt();
          metodos. leerLado();

              break;
          case 2 :
             System.out.println("el perimetro es :" );
             metodos.Perimetro();
              
              break;
               case 3 :
              System.out.println("el Area es :" );
             metodos.Area();
              
              break;
                    case 4:
              System.out.println(" Salir");
              break;
        }
        
       }while(op>=1 && op<5);
       
      
                
        
    }
}
