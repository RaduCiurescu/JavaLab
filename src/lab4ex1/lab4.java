package lab4ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

enum Mod{
    color,alb_negru;
}
enum Stare_echipament{
    achizitionat, expus, vandut;
}
enum Format{
    A3,A4;
}
enum Sistem_operare{
    Linux,Windows;
}

public class lab4 {
    private List<echipament> echipamente=new ArrayList<echipament>();
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader= new BufferedReader(new FileReader("echipamente.txt"));
        String text;
        while((text=reader.readLine())!= null)
        {
            String[] coeficienti=text.trim().split("\\s+");
            int a= Integer.parseInt(coeficienti[0]);
            int b= Integer.parseInt(coeficienti[1]);
            int c= Integer.parseInt(coeficienti[2]);
        }
    }
}

