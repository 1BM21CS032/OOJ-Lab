package CIE.Student;
import java.util.Scanner;

public class Student{
    public String usn = new String();
    public String name = new String();
    public int sem;

    public Student (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter usn, name and semester of the student:");
        usn=s.next();
        name=s.next();
        sem=s.nextInt();
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("USN: "+ usn);
        System.out.println("Semester: "+ sem);
    }
}
