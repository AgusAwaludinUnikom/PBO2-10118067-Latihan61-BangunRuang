/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan61.bangunruang;

/**
 *
 * @author
 * Agus Awaludin
 * 10118067
 * PBO2 / IF2
 * Latihan ini berisi tentang bagaimana menghitung volume bangun ruang
 * menggunakan konsep abstraksi dan interface
 */
public class PBO210118067Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaBasket bolbas = new BolaBasket();
        bolbas.setJariJari(7);
        System.out.println("Volume bola basket : " + bolbas.hitungVolume() +" cm³");
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.println("Volume tabung : " + tabung.hitungVolume() + " cm³");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println("Volume kerucut : " + kerucut.hitungVolume() + " cm³");
    }
    
}
