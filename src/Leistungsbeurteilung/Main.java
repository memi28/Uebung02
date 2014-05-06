/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Leistungsbeurteilung;

/**
 *
 * @author nurgul
 */
public class Main {
    public static void main(String[] args) {
    
        Mensch m = new Mensch("Hanswurst", 75, "M");
        System.out.println(m.printAll());
        
        //Aufgabe3
        Kind k = new Kind("-Regen","Bogen",20);
        k.Status();
        k = new Student(12345," web-Studiengang ","Hans ","Josef ",20);
        k.Status();
        
        
        
    
    }
    
}
