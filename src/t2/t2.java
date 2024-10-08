package t2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) throws FileNotFoundException {
        int x,i=0,min=-1,max=0,s=0,med=0;
        Scanner scanner = new Scanner(new File("in.txt"));

        while(scanner.hasNext())
        {
            x=scanner.nextInt();
            s=s+x;
            if(max<x)
                max=x;
            if(min>x)
                min=x;
            i++;
        }
        System.out.println("suma e " +s+ "minimul e "+ min+" maximul e "+max+" media aritmetica e"+ s/i);
    }
}
