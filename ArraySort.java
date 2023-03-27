import java.util.*;
class ArraySort{
 public static void main(String args[]){
  int i,j;
  int a[]=new int[5];
  System.out.println("Enter Elements : ");
  Scanner inp=new Scanner(System.in);
  for(i=0;i<a.length;i++){
   a[i]=inp.nextInt();
  }
  int temp;
  for(i=0;i<a.length;i++){
   for(j=0;j<a.length;j++){
    if(a[i]<a[j]){
     temp=a[i];    
     a[i]=a[j];
     a[j]=temp;
    }
   }
  }
  System.out.println("Sorted Elements : ");
  for(i=0;i<a.length;i++){
   System.out.println(a[i]);
  }
 } 
}  
