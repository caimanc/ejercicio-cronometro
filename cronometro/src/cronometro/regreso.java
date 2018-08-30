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
public class regreso extends tiempo {

    public regreso(int hora, int minuto, int segundo, int decima, int centecima, int milesima) {
        super(hora, minuto, segundo, decima, centecima, milesima);
    }

    
    public void mostrarregreso()
    {
        int h=getHora();
        int m=getMinuto();
        int s=getSegundo();
        int d=getDecima();
        int cs=getCentecima();
        int ms=getMilesima();
        int unidad=0;
        
    
        do //horas
        {
            
                do //minutos 
                {   
                    
                    do //segundos
                    { 
                        do
                        {
                            do
                            {
                                do
                                {
                                    if (unidad<=10000) {
                                        System.out.println(h+":"+m+":"+s+":"+d+":"+cs+":"+ms);
                                    delaysegundo();
                                    unidad++;
                                    ms--;
                                    }                           
                                    
                                } while(ms>=0);
                                        ms = 9;
                                        cs--;
                            }while (cs>=0);
                            cs = 9;
                            d--;                                
                        }while ( d>=0);
                        d = 9;
                        s--;
                    }while ( s>=0); 
                    s=59;
                    m--;
                } while (m>=0);
                m=59;
            h--;
        }while (h>=0);
        
        
    }
}

    

