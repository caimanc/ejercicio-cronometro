/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author PROFESIONAL
 */

import java.util.Scanner;
public class Cronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese opcion:");
        System.out.println("1) cronometro ");
        System.out.println("2) cuenta regresiva");
        int opc=sc.nextInt();
        if (opc==1) {
            crono c=new crono(0,0,0,0,0,0);
            c.mostrarcronometro();
        }else{
            int h;
            int m;
            int s;
            int d=0 ;
            int ms=0;
            int cs=0;
            
            regreso r=new regreso(0,0,10,0,0,0);
            r.mostrarregreso();
        }
    }
    
}
