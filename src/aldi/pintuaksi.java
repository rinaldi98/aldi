package aldi;

public class pintuaksi {
    public static void main(String[] args) {
        pintu r1 = new pintu();
        r1.panjang = 9;
        r1.lebar = 4;
        
        r1.cetakInfo();
        System.out.println("Luas pintu: "+r1.hitungLuas());
        r1.cetakInfo();
        
        pintu r2 = new pintu();
        r2.cetakInfo();
        
        pintu r3 = new pintu();
        r2.cetakInfo();
    }
}
