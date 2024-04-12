/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author tomch
 */
public class Table implements java.io.Serializable {
    private  int numero;
    private boolean occupee;

    public Table(int numero) {
        this.numero = numero;
        this.occupee = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getStringNumero() {
        return Integer.toString(numero);
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

}
