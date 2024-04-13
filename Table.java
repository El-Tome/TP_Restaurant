/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author tomch
 */
public class Table implements java.io.Serializable {
    private  int numero;
    private boolean occupee;
    private ArrayList<Plat> plats;

    public Table(int numero) {
        this.numero = numero;
        this.occupee = false;
        this.plats = new ArrayList<Plat>();
    }

    public int getNumero() {
        return numero;
    }

    public String getStringNumero() {
        return Integer.toString(numero);
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public boolean isOccupee() {
        return occupee;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOccupee(boolean occupee) {
        this.occupee = occupee;
    }

    public void addPlat(Plat plat) {
        plats.add(plat);
    }

    public void removePlat(Plat plat) {
        plats.remove(plat);
    }

    public void reset() {
        plats.clear();
        occupee = false;
    }
}
