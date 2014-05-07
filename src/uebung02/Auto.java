/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung02;

/**
 *
 * @author nurgul
 */
public class Auto extends Fahrzeug implements Comparable<Auto>{

   
    private boolean klimaanlage;
    private short airbags;
    //public enum color[rot];

    public Auto( short reifen, color farbe, short ps, short tueren,short airbags ) {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }
    
    public void klimaanlageAn(){
        if (klimaanlage = false){
        klimaanlage = true;
        }
        else {
            System.out.println("Die Klimaanlage läuft bereits");
        }
    }
    
    public void klimaanlageAus(){
        if (klimaanlage = true){
        klimaanlage = false;
        }
        else {
            System.out.println("Die Klimaanlage ist bereits aus");
        }
    }

    @Override
    public String toString() {
        //return "Auto{" + "klimaanlage=" + klimaanlage + ", airbags=" + airbags + '}';
        return "PS = "+ super.getPs();
        
    }
 
    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    @Override
    public int compareTo(Auto x) {
        if(this.getPs()<x.getPs()){
             return 1;
        }
        else if(this.getPs()>x.getPs()){
            return -1;
        }
        else {
            return 0;
        }
    
    }
    }
    

