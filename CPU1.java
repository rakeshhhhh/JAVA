import java.util.Scanner;
class Cpu{
 double price;
 class Processor{
  double cores;
  String manufacturer;
  double getCache(){
   return 4.3;
  }
 }
 static class Ram{
  double memory;
  double getClockSpeed() {
  return 5.5;
  }
 }
}
class CPU1{
 public static void main(String args[]){
 Scanner inp=new Scanner(System.in);
 Cpu Obj1=new Cpu();
 Cpu.Processor Obj2= Obj1.new Processor();
 Cpu.Ram Obj3= new Cpu.Ram();
 System.out.println("Enter the price of CPU: ");
 double a=inp.nextDouble();
 System.out.println("Enter no of cores: ");
 double b=inp.nextDouble();
 System.out.println("Enter the manufacturer of processor: ");
 String m=inp.next();
 System.out.println("Enter the memory of RAM: ");
 double d=inp.nextDouble();
 Obj1.price=a;
 Obj2.cores=b;
 Obj2.manufacturer=m;
 Obj3.memory=d;
 System.out.println();
 System.out.println(" Price of the cpu: "+Obj1.price);
 System.out.println(" No of core in processor: "+Obj2.cores);
 System.out.println(" Name of the manufacturer: "+Obj2.manufacturer);
 System.out.println(" Processor cache: "+Obj2.getCache());
 System.out.println(" Memory capacity: "+Obj3.memory+" GB");
 System.out.println(" Clock speed of ram: "+Obj3.getClockSpeed());
 System.out.println();
 }
}


