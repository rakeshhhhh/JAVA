class Complex{
 double real;
 double img;
 
 Complex(){}
 
 Complex(double r,double i){
  this.real=r;
  this.img=i;
 }
 
 Complex sum(Complex c1,Complex c2){
  Complex temp=new Complex();
  temp.real=c1.real+c2.real;
  temp.img=c1.img+c2.img;
  return temp;
 }
 
 public static void main(String args[]){
  Complex c1=new Complex(3.2,4.5);
  Complex c2=new Complex(4.3,5.1);
  Complex temp1=new Complex();
  temp1=temp1.sum(c1,c2);
  System.out.println("Sum Is : "+temp1.real+"+i"+temp1.img);
 }
} 
