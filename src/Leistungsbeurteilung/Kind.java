/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Leistungsbeurteilung;

/**
 *
 * @author nurgul
 */
public class Kind {
    String vorname;
    String nachname;
    int alter;

    public Kind(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public void Status(){
        System.out.println("Es handelt sich um einen Mensch "+vorname+" "+nachname+" "+alter);
    }
    
}
