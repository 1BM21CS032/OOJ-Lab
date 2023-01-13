import CIE.Student.*;
import CIE.Internals.*;
import SEE.*;

public class packages {
    public static void main(String[] args) {
        System.out.println("Creating a new Studet...");
        Student s1 = new Student();
        External e = new External();
        s1.display();
        e.display();
    }
}
