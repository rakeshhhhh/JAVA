import java.util.*;
public class StrManipulate{
 public static void main(String[] args){
  int ch,x;
  Scanner inp=new Scanner(System.in);
  System.out.println("\n M E N U \n");
  System.out.println(" 1.Create New String");
  System.out.println(" 2.Getting String length");
  System.out.println(" 3.String Concatination");
  System.out.println(" 4.Charactor Extraction");
  System.out.println(" 5.String Comparison");
  System.out.println(" 6.Searching Substring");
  System.out.println(" 7.Modifing String");
  System.out.println(" 8.Exit ");
  do{
   System.out.println("\n Enter Your Choice [1-8] : ");
   ch=inp.nextInt();
   switch(ch){
    case 1:System.out.println("\n Enter String: ");
	   String str1 = new String();
	   str1 = inp.nextLine();
	   str1+= inp.nextLine();
	   System.out.println(" Entered String is: "+str1);
	   break; 
    case 2:System.out.println("\n Enter String: ");
           String str = new String();
           str = inp.nextLine();
           str+= inp.nextLine();
	   int len = str.length();
	   System.out.println(" Length of String is: "+(len));
	   break;
    case 3:System.out.println(" Enter Your First String :");
           String f=inp.next();
           System.out.println(" Enter Your Second String :");
           String s=inp.next();
	   String fs=f.concat(" "+s);
	   System.out.println(" After concatination the String is: "+fs);
	   break;
    case 4:System.out.println("\n Enter String: ");
	   String st = new String(inp.next());
	   System.out.println(" Enter an index");
	   int i=inp.nextInt();
	   char c = st.charAt(i);
	   System.out.println(" Character at "+i+" is "+c);
	   break;
    case 5:System.out.println(" Enter Your First String :");
	   String s1=inp.next();
	   System.out.println(" Enter Your Second String :");
	   String s2=inp.next();
	   if(s1.equals(s2)) {
	    System.out.println(" Both Strings are equal ");
	   }
	   else {
	    System.out.println(" Strings are not equal ");
	   }
	   break;			
    case 6:System.out.println(" Enter the String :");
	   String ss1=inp.next();
	   System.out.println(" Entered String is : " + ss1);
	   System.out.println(" Enter SubString :");
	   String ss2=inp.next();
	   int index = ss1.indexOf(ss2); //int index1 = ss1.lastIndexOf(ss2); 
	   System.out.println("Substring " + ss2 + " is at index "+ index); //System.out.println("Substring " + ss2 + " is from last index "+ ss1.lastIndexOf(ss2));
	   break;
    case 7:System.out.println("\n Enter String: ");
	   String ss = new String();
	   ss =inp.next();
	   System.out.println(" Entered String is : "+ss);
	   System.out.println(" Enter where to replace.. : ");
	   String re=inp.next();
	   System.out.println(" Enter word to replace.. : ");
	   String rep=inp.next();
	   String replaced=ss.replace(re,rep);
	   System.out.println(" After replacing: "+replaced);
	   break; 	
    case 8:System.out.println(" Thank You !!! ");
           break;
    }
    System.out.println("\n Do You Want to Continue [0/1] : ");
    x=inp.nextInt();
   }while(x==1);	
  }
}
