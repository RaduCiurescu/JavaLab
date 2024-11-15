package LAB3e1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<parabola> parabolaList= new ArrayList<parabola>();
        BufferedReader reader= new BufferedReader(new FileReader("in.txt"));
        String linie;
        while((linie=reader.readLine())!= null)
        {
            String[] coeficienti=linie.trim().split("\\s+");
            int a= Integer.parseInt(coeficienti[0]);
            int b= Integer.parseInt(coeficienti[1]);
            int c= Integer.parseInt(coeficienti[2]);
        }


        parabolaList.add(new parabola(3,5,7));
        parabolaList.add(new parabola(2,6,5));
        parabolaList.add(new parabola(-3,5,6));
        System.out.println("lista contine parabolele:");
                for(parabola p:parabolaList) {
                    System.out.println("\n" + p.toString());
                }
                System.out.println("");
    }
}
