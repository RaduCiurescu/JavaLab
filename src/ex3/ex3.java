package ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        int x;
        Scanner scanner = new Scanner(new File("in.txt"));
        while(scanner.hasNext())
        {
            x=scanner.nextInt();
            System.out.println(" "+x);
        }
    }
}
