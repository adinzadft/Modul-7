package modul7;
import java.io.*;
public class methodVolumeBola {
    public static double VolumeBola(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String diameter="";
        try {
            diameter = input.readLine();
        } catch (Exception e) {
        }
        double doubleDiameter=Double.parseDouble(diameter);
        double jari2=doubleDiameter/2;
        double luas = (4d/3)*Math.PI*Math.pow(jari2, 3);
        return luas;
    }
    public static void main(String[] args) {
        methodVolumeBola one = new methodVolumeBola();
        System.out.print("masukkan dimater = ");
        System.out.println(one.VolumeBola());
    }
}
