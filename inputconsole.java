package modul7;

import java.io.*;

public class inputconsole {
    public static String readString(){
        BufferedReader bfr=new BufferedReader (new InputStreamReader(System.in));
        String string = "";
        try {
            string = bfr.readLine();
        } catch (Exception e) {
            System.out.println("Errror");
        }
        return string;
        
    }
    public static int readInt(){
        return Integer.parseInt(readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
    public static void main(String[] args) {
        
    }
}
