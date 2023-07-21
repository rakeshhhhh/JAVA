
import java.util.*;
import java.io.*;

class Myexp extends Exception{
	
	public Myexp(String msg) {
		System.out.println(msg);
		
	}
}

public class Exception13 {

	public static void main(String[] args) throws Myexp {
		
        System.out.print("Enter number of input numbers: ") ;
        Scanner sc= new Scanner(System.in );
        int n = sc.nextInt( );
        
        int k = 0, sum = 0;
        
        Integer[] mynum = new Integer[n];
        
        while(n>0) {
        	 try {
        		 System.out.print("Enter numbers: ");
            	 int num = sc.nextInt( );
            	 
            	 if (num < 0) {
            		 throw new Myexp("Number is negative");
            	 }
            	 
            	 else {
            		mynum[k] = num;
            		sum = sum +num;
            		k++;
            	 }
            	 
            	 n--; 
        	 }
        	 
        	 catch (Myexp e) {
        		 System.out.println(e);
			}
        	 
        }
        System.out.println("The average is " + sum/k );
	}

}
