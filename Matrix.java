import java.util.Scanner; 
class Matrix{
 public static void main(String args[]){
 int r,c,i,j;
 Scanner inp = new Scanner(System.in);
 System.out.println("Enter the number of rows");
 r=inp.nextInt();
 System.out.println("Enter the number columns");
 c=inp.nextInt();
 int a[][] = new int[r][c];
 int b[][] = new int[r][c];
 int sum[][] = new int[r][c]; 
 System.out.println("Enter the elements of matrix 1");
 for(i=0;i<r;i++){ 
  for(j=0;j<c;j++ )
   a[i][j]=inp.nextInt();
  System.out.println();
 }
 System.out.println("Enter the elements of matrix 2");
 for(i=0;i< r;i++){
  for(j=0;j<c;j++)
   b[i][j] = inp.nextInt();
  System.out.println();
 }
 for(i=0;i<r;i++ )
  for(j=0;j<c;j++ )
   sum[i][j] = a[i][j]+b[i][j] ; 
 System.out.println("Sum of matrices:-");
 for(i=0;i<r;i++ ){
  for(j=0;j<c;j++ )
   System.out.print(sum[i][j]+"\t");
  System.out.println();
 }
 }
}
