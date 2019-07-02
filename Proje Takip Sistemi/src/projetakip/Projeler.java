/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetakip;

import java.util.ArrayList;

/**
 *
 * @author BURAK
 */
public class Projeler {

    public static ArrayList<Projeler> Proje = new ArrayList();
    public String kodu;
    public String projeadi;
    public String baslangıctarih;
    public String bitistarihi;
    
    Projeler(String Kod,String ProjeAdi,String BaslangicTarih,String BitisTarih){
       this.kodu=Kod;
       this.projeadi=ProjeAdi;
       this.baslangıctarih=BaslangicTarih;
       this.bitistarihi=BitisTarih;
    }

    Projeler() {
    }
    
}
