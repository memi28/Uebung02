/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Leistungsbeurteilung;

/**
 *
 * @author nurgul
 */
public class Mensch extends Saugetier{

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    
    public String printAll(){
    return name + " # " + alter + " # " + geschlecht;
    
    }
    
}
