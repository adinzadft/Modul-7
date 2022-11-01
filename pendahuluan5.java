
package modul7;
public class pendahuluan5 {
    //void
    static void Hello(String nama){
        System.out.println("Hallo " + nama);
    }
    
    //int
    static int kali(int num1, int num2){
        int hasil = num1*num2;
        return hasil; 
    }
    
    //String
    static String namaLengkap(String namaDepan, String namaBelakang){
        String nmlngkp= namaDepan + " " + namaBelakang;
        return nmlngkp;
    }
    
    //double
    static double rata2(double jumlah,int banyak){
        double Rata2 = jumlah/banyak;
        return Rata2;
    }
    public static void main(String[] args) {
        Hello("Zidan");
        System.out.println(kali(2,5));
        System.out.println(namaLengkap("Zidan","Firdaus"));
        System.out.println(rata2(100,3));
    }
}
