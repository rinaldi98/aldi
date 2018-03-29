package aldi;
public class pintu {
    double lebar;
      double panjang;

    public pintu() {
        panjang=35;
        lebar=170;
    
    
    
    }

    public pintu(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
      
      
      
      void cetakInfo(){
          System.out.println("Panjang       :"+lebar);
          System.out.println("Panjang       :"+panjang); 
          
      }
      
       double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }

    void cetakLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
