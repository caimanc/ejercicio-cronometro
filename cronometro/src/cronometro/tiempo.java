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
public class tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    private int decima;
    private int centecima;
    private int milesima;

    public tiempo(int hora, int minuto, int segundo, int decima, int centecima, int milesima) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.decima = decima;
        this.centecima = centecima;
        this.milesima = milesima;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getDecima() {
        return decima;
    }

    public int getCentecima() {
        return centecima;
    }

    public int getMilesima() {
        return milesima;
    }

            
    public void delaysegundo(){
        try{
            Thread.sleep(1);
        }catch(InterruptedException e){}
    }
        
}
