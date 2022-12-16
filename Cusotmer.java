import java.util.Scanner;

class Customer{
private int cust_no;
private String cust_name;
private int quantity;
private float price;
private float total_price,discount,net_price;

Customer(){}

Customer(int no,String name,int qua,float pri){
cust_no=no;
cust_name=name;
quantity=qua;
price=pri;
total_price=quantity*price;
}

void input(){
Scanner s=new Scanner(System.in);
System.out.println("Enter customer number, name, quantity and price:");
cust_no=s.nextInt();
cust_name=s.next();
quantity=s.nextInt();
price=s.nextFloat();
total_price=quantity*price;
}

void calDiscount(){
if(total_price>=50000){
discount=(float)(total_price*0.25);
}else if(total_price>=25000){
discount=(float)(total_price*0.1);
}else{
discount=0;
}
net_price=total_price-discount;
}

void disp(){
System.out.println("\nCustomer number: "+cust_no+"\nCustomer name: "+cust_name+"\nQuantity: "+quantity+"\nItem price: "+price+"\nTotal price: "+total_price+"\nDiscount: "+discount+"\nNet price: "+net_price+"\n");
}

}

class custmain{
public static void main(String x[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter number of objects to be created");
int n=s.nextInt();

Customer[] c=new Customer[n];

for(int i=0;i<n;i++){
    System.out.println("Enter customer number,customer name,item quantity,item price");
    int no=s.nextInt();
    String name=s.next();
    int qua=s.nextInt();
    float pr=s.nextFloat();
    c[i]=new Customer(no,name,qua,pr);
    c[i].calDiscount();
}

for(int i=0;i<n;i++){
    c[i].disp();
}

}

}