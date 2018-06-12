/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calseobjetos;

import java.util.Scanner;

/**
 *
 * @author Mr
 */
public class Cuadrado {
    
double Lado;
double Perimetro;
double Area;

Scanner L = new Scanner (System.in);

public Cuadrado()
{
Lado = 0;
Perimetro = 0;
Area = 0;
}

public void leerLado()
{
System.out.println("Escribre el valor de los lados:");
Lado = L.nextDouble();
}

public void Perimetro()
{
Perimetro = 4*Lado;
System.out.println("**********:"+ Perimetro);
}

public void Area()
{
Area = Math.pow(Lado,2);
System.out.println("************:"+ Area);
}

//public void Mostrar()
//{
//System.out.println("Valor de los Lados:" + Lado);
//System.out.println("El Perimetro es:"+ Perimetro);
//
//}

    void setdatos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Perimetro(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }


 

 


