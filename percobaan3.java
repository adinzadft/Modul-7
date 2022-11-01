package modul7;

import javax.swing.*;

public class percobaan3 {
    public static void rectangle(){
        String inputPanjang = JOptionPane.showInputDialog("Masukkan Panjang");
        String inputLebar = JOptionPane.showInputDialog("Masukkan Lebar");
        int panjang =  Integer.parseInt(inputPanjang);
        int lebar =  Integer.parseInt(inputLebar);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = "+panjang*lebar);
    }
    public static void triangle(){
        String inputAlas = JOptionPane.showInputDialog("Masukkan Alas");
        String inputTinggi = JOptionPane.showInputDialog("Masukkan Tinggi");
        int alas =  Integer.parseInt(inputAlas);
        int tinggi =  Integer.parseInt(inputTinggi);
        JOptionPane.showMessageDialog(null, "Luas Segitiga = "+0.5d*alas*tinggi);
    }
    public static void circle(){
        String inputjari2 = JOptionPane.showInputDialog("Masukkan Jari-jari");
        double jari2 =  Double.parseDouble(inputjari2);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran= "+Math.PI*Math.pow(jari2, 2));
    }
    public static void main(String[] args) {
        int ulang = 0;
        while(ulang == 0){
            String cek = JOptionPane.showInputDialog("Hitung Luas:\n1. Persegi Panjang\n2. Segitiga\n3.Linkaran");
            switch(cek){
                case "1":
                    rectangle();
                    break;
                case "2":
                    triangle();
                    break;
                case "3":
                    circle();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "invalid login");
                    break;
            }
            ulang = JOptionPane.showConfirmDialog(null, "lagi?");    
        }
    }
}
