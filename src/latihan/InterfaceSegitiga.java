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
public class InterfaceSegitiga implements InterfaceBangunDatar{
    public double alas;
    public double tinggi;
    
    public InterfaceSegitiga(double alas,double tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungKeliling()
    {
        return 2 * alas + tinggi;
    }
    public double hitungLuas()
    {
        return (alas * tinggi)/2;
    }
}
