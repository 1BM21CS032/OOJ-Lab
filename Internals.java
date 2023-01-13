package CIE.Internals;

import java.util.Scanner;

public class Internals{

    public int cie_marks[] = new int[5];
    public int i;

    public void input (){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter CIE marks of 5 subjects:");
        for (i=1; i<=5; i++){
            cie_marks[i]=si.nextInt();
        }
    }
    public void display(){
        System.out.println("Internals marks: ");
        for (int i=1; i<5; i++){
            System.out.printf("%d  ", cie_marks[i]);
            System.out.println("");
        }
    }
}
