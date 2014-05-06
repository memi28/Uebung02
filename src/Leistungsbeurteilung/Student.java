/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Leistungsbeurteilung;

import java.util.logging.Logger;

/**
 *
 * @author nurgul
 */
public class Student extends Kind {

    int matrikelnummer;
    String studiengang;

    public Student(int matrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um einen Studenten " + matrikelnummer + " " + studiengang + " " + vorname + " " + nachname + " " + alter);
    }
    
}
