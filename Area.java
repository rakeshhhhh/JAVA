import java.util.*;
class A{
 int a,b;
 int area(int a1){
  this.a=a1;
  return(a*a);
 }
 int area(int l,int b){
  this.a=l;
  this.b=b;
  return(a*b);
 }
}
class Area{
 public static void main(String args[]){
  int a1,l,b;
  Scanner inp=new Scanner(System.in);
  System.out.println("Enter Side of Square : ");
  a1=inp.nextInt();
  System.out.println("Enter Length and Breadth of Rectangle: ");
  l=inp.nextInt();
  b=inp.nextInt();
  A Obj=new A();
  System.out.println("Area Of Square : "+Obj.area(a1));
  System.out.println("Area Of Rectangle : "+Obj.area(l,b)); 
 } 
}  
