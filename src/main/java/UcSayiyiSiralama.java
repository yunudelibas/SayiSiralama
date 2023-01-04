package Donguler;

import java.util.Scanner;

public class UcSayiyiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner girdi= new Scanner(System.in);
        System.out.print("a sayısını giriniz:");
        a= girdi.nextInt();
        System.out.print("b sayısını giriniz:");
        b= girdi.nextInt();
        System.out.print("c sayısını giriniz:");
        c= girdi.nextInt();
        if (a>b && a>c) {
            if (b>c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if (b>a && b>c) {
            if (a>c) {
                System.out.println("b>a>c");
            } else {
                System.out.println("b>c>a");
            }
        } else {
            if (a>b){
                System.out.println("c>a>b");
            }
            else {
                System.out.println("c>b>a");
            }
        }

    }
}
