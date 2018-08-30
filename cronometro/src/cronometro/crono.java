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

    public crono(int hora, int minuto, int segundo, int decima, int centecima, int milesima) {
        super(hora, minuto, segundo, decima, centecima, milesima);
    }

    

     
    
    public void mostrarcronometro(){
        int h=getHora();
        int m=getMinuto();
        int s=getSegundo();
        int cs=getCentecima();
        int ds=getDecima();
        int ms=getMilesima();
        int unidad=0;
        for ( h = 0; h < 24; h++) {
            for (m = 0; m < 60; m++) {
                for ( s = 0; s < 60; s++) {
                    for ( cs = 0; cs < 10; cs++) {
                        for (ds = 0; ds < 10; ds++) {
                            for (ms = 0; ms < 10; ms++) {
                                if (unidad<=10000) {
                                    System.out.println(h+":"+m+":"+s+":"+ds+":"+cs+":"+ms);
                                    delaysegundo();  
                                    unidad++;
                                }                                                                  
                            }                            
                        }
                        
                    }
                    
                } 
            }
           
            }  
        }
   
               
    }
    
    
