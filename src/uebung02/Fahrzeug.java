/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung02;

import java.util.logging.Logger;

/**
 *
 * @author nurgul
 */
public class Fahrzeug {

    private short reifen;
    private color farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    
    public enum color{
        Silber, Schwarz, Rot, Blau, Weiß
    }
    

    public Fahrzeug(short reifen, color farbe, short ps, short tueren) {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = 0;
        anzahl++;
    }
    
    public static int anzahl;
    
    public void starten(){
        gestartet = true;
        
    }

    public void stoppen(){
        gestartet = false;
    }
    
    public void beschleunigen (short geschwindigkeit){
        if (gestartet){ 
        this.geschwindigkeit += geschwindigkeit;
        }
        if(geschwindigkeit > 250) {
            this.geschwindigkeit = 250;
        }
    }
    
    public void bremsen (short geschwindigkeit){
        if(gestartet){
            this.geschwindigkeit -=geschwindigkeit;
        }
        if (geschwindigkeit<0){
            this.geschwindigkeit = 0;
        }
    }
    
    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public short getReifen() {
        return reifen;
    }

    public color getFarbe() {
        return farbe;
    }

    public short getPs() {
        return ps;
    }

    public short getTueren() {
        return tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getAnzahl() {
        return anzahl;
    }
    
    
    
    
}
