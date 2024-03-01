/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author ACER
 */
public class TugasPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mb = new Mobil();
        
        MobilCoupe mc= new MobilCoupe();
        MobilMinivan mm= new MobilMinivan ();
        MobilPicup mp= new MobilPicup ();
        MobilSedan ms= new MobilSedan ();
        MobilTruk mt= new MobilTruk ();
        
        mb.kecepatan();
        mc.kecepatan();
        mm.kecepatan();
        mp.kecepatan();
        ms.kecepatan();
        mt.kecepatan();
    }
    
}
