package ex2;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis= "in.txt";
        BufferedReader flux_in=new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
    String linie= flux_in.readLine();
    int x= Integer.parseInt(linie);
        System.out.print(" in fisier se afla nr "+x);
    }
}
