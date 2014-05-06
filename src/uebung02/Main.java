/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import uebung02.Fahrzeug.color;

/**
 *
 * @author nurgul
 */
public class Main {

    public static void main(String[] args) {

        Auto bmw = new Auto((short) 4, color.Silber, (short) 220, (short) 5, (short) 4);
        Auto audi = new Auto((short) 4, color.Schwarz, (short) 180, (short) 5, (short) 8);
        System.out.println(bmw.getReifen() + " Reifen, Farbe " + bmw.getFarbe() + ", " + bmw.getPs() + "PS, " + bmw.getTueren() + " Tueren, " + bmw.getAirbags() + " Airbags.");
        System.out.println(audi.getReifen() + " Reifen, Farbe " + audi.getFarbe() + ", " + audi.getPs() + "PS, " + audi.getTueren() + " Tueren, " + audi.getAirbags() + " Airbags.");
        Wasserfahrzeug titanic = new Wasserfahrzeug((short) 0, color.Blau, (short) 51000, (short) 0, 10.54, (short) 4, 100000);
        System.out.println(titanic.getReifen() + " Reifen, Farbe " + titanic.getFarbe() + ", " + titanic.getPs() + ", " + titanic.getTueren() + "Tueren, " + titanic.getTiefgang() + "m Tiefgang," + titanic.getSchrauben() + " Schrauben," + titanic.getLadung() + "kg Ladung");

        Auto audi2 = new Auto((short) 4, color.Blau, (short) 200, (short) 5, (short) 8);
        Auto audi3 = new Auto((short) 4, color.Schwarz, (short) 180, (short) 5, (short) 4);
        Auto audi4 = new Auto((short) 4, color.Silber, (short) 175, (short) 5, (short) 8);

        //Aufgabe 4
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);
        for (Auto a : liste) {

            //System.out.println(a.getPs()); 

            //Ausgabe mittels toString Methode
            System.out.println(a.toString());

        }
    }
}
