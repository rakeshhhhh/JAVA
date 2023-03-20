import java.util.Scanner;
import java.util.Arrays;
class StringSort{
 public static void main(String[] args){
 int i,j;
 Scanner inp=new Scanner(System.in);
 System.out.println("Enter the Limit:");
 int n=inp.nextInt();
 String ar[]=new String[n];
 System.out.println("\n Enter The Words :");
 for(i=0;i<n;i++){
 ar[i]=inp.next();
 }
 Arrays.sort(ar);
 //System.out.println("Sorted Strings : "+Arrays.toString(ar));
 System.out.println("\n Sorted Strings : \n ");
 for(i=0;i<n;i++){
 System.out.println(ar[i]);
 }
 }
}

