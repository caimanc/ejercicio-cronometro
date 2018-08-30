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
public class crono extends tiempo {

    public crono(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }   
    
    public void mostrarcronometro(){
        int h=getHora();
        int m=getMinuto();
        int s=getSegundo();
        for ( h = 0; h < 24; h++) {
            for (m = 0; m < 60; m++) {
                for ( s = 0; s < 60; s++) {
                    System.out.println(h+":"+m+":"+s);;
                    delaysegundo();
                } 
            }
           
            }  
        }
   
               
    }
    
    
