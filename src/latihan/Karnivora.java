/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class Karnivora {
    public static void main(String[] args) {
        //Cara penulisan objek: (superclass) variabel = new (subclass)
        System.out.println("===== Hewan Default =====");
        Hewan h = new Hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== Hewan Kucing =====");
        Kucing k = new Kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();
        
        System.out.println("===== Hewan Singa =====");
        Singa s = new Singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }
}
