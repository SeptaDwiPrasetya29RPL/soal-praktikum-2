
package pohon;

import java.util.Scanner;

public class Pohon {
    Scanner in = new Scanner(System.in);
    String nama;
    int tinggi;
    
    void setNama(){
        System.out.print("Masukkan nama pohon = ");
        nama = in.nextLine();
    }
    void setTinggi(){
        System.out.print("Masukkan tinggi pohon = ");
        tinggi = in.nextInt();
    }
    String getNama(){
        return nama;
    }
    int getTinggi(){
        return tinggi;
    }
    
}
