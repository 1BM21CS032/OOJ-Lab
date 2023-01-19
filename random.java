import java.util.*;

class Thread1 implements Runnable{
    Thread t;
    int num1;
    Random r = new Random();

    Thread1(){
        t = new Thread(this,"t1"); 
    }

    public void run(){
        try{
            for (int i=10; i>=0; i++){
                num1 = r.nextInt(50);
                Thread.sleep(100);
            }
        }
        catch (InterruptedException i){
            System.out.println("Interrupted in t1: "+i);
        }
    }
}

class Thread2 implements Runnable{
    Thread t;
    int num2;

    Thread2(int n){
        t = new Thread(this, "t2");
        num2 = n;
    }

    public void run (){
        if (num2%2 == 0){
            System.out.println("Square of "+num2+"= "+ (num2*num2));
        }
    }
} 

class Thread3 implements Runnable{
    Thread t;
    int num3;

    Thread3(int n){
        t = new Thread(this, "t3");
        num3 = n;
    }

    public void run (){
        if (num3%3 != 0){
            System.out.println("Number is: "+num3);
        }
    }
}

class random{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.t.start();
        Thread2 t2 = new Thread2(t1.num1);
        Thread3 t3 = new Thread3(t1.num1);
        t2.t.start();
        t3.t.start();
    }
}