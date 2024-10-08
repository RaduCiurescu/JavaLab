package t1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("introdu lungimea ");
        int a=scanner.nextInt();
        System.out.print("introdu latimea ");
        int b= scanner.nextInt();
        System.out.println(" aria dreptunghiului este "+(a*b));
        scanner.close();
    }
}
