package modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class pendahuluan3 {
    public static void main(String[] args) {
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int a = 5;
            System.out.println(a/0);
        } catch(Exception e){
            System.out.println("Error");
        } finally{
            System.out.println("Angka tidak bisa dibagi nol");
        }
        
    }
}
