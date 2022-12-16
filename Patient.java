import java.util.Scanner;

class Patient{

    int p_id, age;
    String p_name, doc;
    static int size;

    Patient (int n){
        size = n;
    }

    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter patient id, name, age and doctor name:");
        this.p_id = s.nextInt();
        this.p_name = s.next();
        this.age = s.nextInt();
        this.doc = s.next();
    }
    public String toString(){
        return this.p_id+"  "+this.p_name+"  "+this.age+"  "+this.doc;
    }
}
class patient_main{
    public static void main(String[] args) {
        int x=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of patients:");
        int size=s.nextInt();

        Patient p[] = new Patient[size];
        for (int i=0; i<size; i++){
            p[i] = new Patient(size);
            p[i].input();
        }
    while (x==0){
        System.out.println("1:Enter patient ID");
        System.out.println("2:Enter Doctor name");
        System.out.println("3:Exit");
        
        int choice = s.nextInt();

        switch(choice){
            case 1: System.out.println("Enter patient ID:");
            int id = s.nextInt();

            for (int i=0;i<size; i++){
                if (p[i].p_id==id){
                    System.out.println(p[i]);
                    break;
                }
                if (i==size-1){
                    System.out.println("Patient does not exist!");
                }
            }
            break;

            case 2:System.out.println("Enter dooctor name:");
            String name = s.next();

            for (int i=0;i<size; i++){
                if (p[i].doc.equals(name)){
                    System.out.println(p[i]);
                }
                if (i==size){
                    System.out.println("Doctor does not exist!");
                }
            }
            break;

            case 3: x=1;
            break;

            default:System.out.println("Enter a valid choice!");
        }
    }
    }
}