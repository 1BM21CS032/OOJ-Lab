import java.util.*;

class WrongAgeException extends Exception{
    String msg = new String();
    WrongAgeException(String x){
        msg=x;
    }
    public String toString(){
        return msg;
    }
}

class Father{

    int f_age;

    Father () throws WrongAgeException{
        Scanner s = new Scanner(System.in);

        System.out.println("Enter father's age:");
        f_age = s.nextInt();

        if (f_age < 0){
            throw new WrongAgeException("Father age < 0");
        }
    }

    void display(){
        System.out.println("Father age: "+f_age);
    }
}

class Son extends Father{

    int s_age;

    Son() throws WrongAgeException{
        Scanner s = new Scanner(System.in);

        System.out.println("Enter son's age:");
        s_age = s.nextInt();

        if (s_age < 0){
            throw new WrongAgeException("Son age < 0");
        }
        else if (s_age > f_age){
            throw new WrongAgeException("Son age is > that father's age!");
        }    
    }
    
    void display(){
        System.out.println("Father age: "+f_age);
        System.out.println("Son age: "+s_age);
    }
}

class excep{
    public static void main(String[] args) {
        try{
            Father f = new Father();
            f.display();
            Son s = new Son();
            s.display();
        }
        catch (WrongAgeException wae){
            System.out.println(wae);;
        }
    }
}
