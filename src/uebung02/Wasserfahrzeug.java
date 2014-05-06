/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung02;

/**
 *
 * @author nurgul
 */
public class Wasserfahrzeug extends Fahrzeug{
    
    private double tiefgang;
    private short schrauben;
    private double ladung;
    
    public void entladen() throws InterruptedException{
        ladung = 0;
        Thread.sleep(5000);
        
    }

    public Wasserfahrzeug(short reifen, color farbe, short ps,short tueren,double tiefgang, short schrauben, double ladung) {
        super(reifen, farbe, ps, tueren);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
    }

    @Override
    public String toString() {
        return "Wasserfahrzeug{" + "tiefgang=" + tiefgang + ", schrauben=" + schrauben + ", ladung=" + ladung + '}';
    }
    
    
    
    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }

    public double getTiefgang() {
        return tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public double getLadung() {
        return ladung;
    }
}
