package modul7;

public class segiempat {
    public void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas=panjang*lebar;
        System.out.println("-----------------------------------");
        System.out.println("Psnjang Segi Empat = " + panjang);
        System.out.println("Lebar Segi Empat = " + lebar);
        System.out.println("Luas Segi Empat = " + luas);
    }
    public static void main(String[] args) {
        segiempat se=new segiempat();
        se.segiempat(10, 5);
    }
}
