/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numromanos;

import java.util.Scanner;

/**
 *
 * @author Mr
 */
public class Numromanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            Scanner sc=new Scanner(System.in);
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String millares []= {"","M"};
      System.out.println("Ingresa numero entre 1 y 1000");
        
      int N = sc.nextInt();
      int u=N%10;
      int d=(N/10)%10;
      int c=N/100;
      int m=N/1000;
       
      
      if (N>=1000){
       System.out.println(millares[m]);
      }else 
          
      if(N>=100){         
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{
          if(N>=10){
              System.out.println(Decena[d]+Unidad[u]);          
          }else{
              System.out.println(Unidad[N]);          
          }          
      }          
    }
}

  