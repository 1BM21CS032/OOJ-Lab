package SEE;

import java.util.Scanner;
import CIE.*;
import CIE.Internals.Internals;

public class External extends Internals{
    int see_marks[] = new int[5];

    public External(){
        input();
        Scanner se = new Scanner(System.in);
        System.out.println("Enter SEE marks of 5 subjects:");
        for (int i=1; i<=5; i++){
            see_marks[i]=se.nextInt();
        }
    }
    public void display(){
        display();
        System.out.println("Externals marks: ");
        for (int i=1; i<5; i++){
            System.out.printf("%d  ", see_marks[i]);
        }
    }
}
