import java.util.*;
class Product{
 int pcode;
 String pname;
 double price;
 void data(){
 Scanner inp=new Scanner(System.in);
 System.out.println("Product Code : ");
 pcode=inp.nextInt();
 System.out.println("Product Name : ");
 pname=inp.next();
 System.out.println("Product Price : ");
 price=inp.nextInt();
 }
 void display(){
  System.out.println(pcode+"\t\t"+pname+"\t\t "+price);       
 }  
 void Lowest(double price1,double price2, double price3){
  if(price1<=price2 && price1<=price3){
   System.out.println("\nProduct 1 is of the lowest price!");
  }
  else if(price2<=price1 && price2<=price3){
   System.out.println("\nProduct 2 is of the lowest price!");
  }
  else{
   System.out.println("\nProduct 3 is of the lowest price!");
   }
 }
 public static void main(String[] args){
  Product Obj1 = new Product();
  Product Obj2 = new Product();
  Product Obj3 = new Product();
  System.out.println("\nEnter Details Of 1st Product:");
  Obj1.data();
  System.out.println("\nEnter Details Of 2nd Product:");
  Obj2.data();
  System.out.println("\nEnter Details Of 3rd Product:");
  Obj3.data();
  System.out.println("Product Information:\n\nProduct Code\tProduct Name\tProduct Price");
  Obj1.display();
  Obj2.display();
  Obj3.display();
  Product Obj = new Product();
  Obj.Lowest(Obj1.price,Obj2.price,Obj3.price);    
 }
}	
