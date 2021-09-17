package Hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, what's your name?");
        Scanner al = new Scanner(System.in);
        String name = al.nextLine();
        System.out.println("Hi, "+name+", I'm computer");
        System.out.println("How old r u?");
        Scanner b = new Scanner(System.in);
        int age = b.nextInt();
        System.out.println("Nice to meet you, "+name+"\t"+age+" y.o." );
        int[] mass = new int [4];
        for (int i=0;i< mass.length;i++) {
            System.out.println("Tap number");
            mass [i] = al.nextInt();
        }
        Arrays.sort(mass);
        for (int j=0;j<mass.length;j++) {
            System.out.print("["+(j+1)+"]="+mass[j]+"\n");
        }
        double sum = 0;
        double max = 0;
        double min = Double.POSITIVE_INFINITY;
        for (int s=0;s<mass.length;s++) {sum=sum+mass[s];
            if(mass[s]<min){
            min=mass[s];
            }
            if(mass[s]>max){
            max=mass[s];
            }
        }
        System.out.println("min= "+min);
        System.out.println("max= "+max);
        System.out.println("summary= "+sum);
        System.out.println("average= "+sum/mass.length);
    }
}
