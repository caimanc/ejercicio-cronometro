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

    public regreso(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }
    
    public void mostrarregreso(){
        int h=getHora();
        int m=getMinuto();
        int s=getSegundo();
        for ( int i = h; i >= 0; i--) {
            for (int j = 59; m >= 0; j--) {
                if (i==h&&j>m) {  
            }else{
                  for ( int k = 59; k >= 0; k--) {
                    if (i==h&&j==m&&k>s) {                        
                    }else{
                        System.out.println(i+":"+j+":"+k);
                        delaysegundo();   
                    }                                       
                }  
                }
                     
            }           
            }  
        }
}
