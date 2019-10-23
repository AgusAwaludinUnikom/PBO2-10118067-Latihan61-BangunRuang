/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan61.bangunruang;

/**
 *
 * @author Kiyo
 */
public class BolaBasket implements BangunRuang {
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return 4.0 /3.0 * 22.0/7.0 * (jariJari*jariJari*jariJari);
    }
    
    
    
    
}
