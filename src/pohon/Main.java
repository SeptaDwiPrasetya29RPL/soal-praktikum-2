
package pohon;

public class Main {

    public static void main(String[] args) {
        
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        
        cemara.setNama();
        cemara.setTinggi();
        
        kelapa.setNama();
        kelapa.setTinggi();
        
        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("==============  POHON  ==============");
        System.out.println(" ");
        System.out.println("1. Nama Pohon = "+cemara.getNama());
        System.out.println("2.. Tinggi Pohon  = "+cemara.getTinggi());
        System.out.println(" ");
        System.out.println("1. Nama Pohon = "+kelapa.getNama());
        System.out.println("2. Tinggi Pohon  = "+kelapa.getTinggi());
        
        

    }
    
}
