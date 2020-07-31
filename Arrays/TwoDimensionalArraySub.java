import java.util.Scanner;

class TwoDimensionalArraySub{
public static void main(String args[]){
int i,j,col,row,k,l,cols,rows;
int mat[][] = new int[10][10];
int mat1[][] = new int[10][10];
int mat2[][] = new int[10][10];
System.out.println("Enter number of rows of matrix 1");
Scanner sc = new Scanner(System.in);
row = sc.nextInt();
System.out.println("Enter number of columns of matrix 1");
col= sc.nextInt();
System.out.println("Enter "+row+"*"+col+"matrix");
for(i=0;i<row;i++){
  for(j=0;j<col;j++){
    mat[i][j] = sc.nextInt();
     
   }
 }
System.out.println("Enter number of rows of matrix 2");
Scanner sc1 = new Scanner(System.in);
rows = sc1.nextInt();
System.out.println("Enter number of columns of matrix 2");
cols= sc1.nextInt();
System.out.println("Enter "+row+"*"+col+"matrix");
for(k=0;k<row;k++){
  for(l=0;l<col;l++){
    mat1[k][l] = sc1.nextInt();
     
   }
 }
for( i =0;i<row;i++){
  for( j =0;j<col;j++){
   mat2[i][j] = mat[i][j]-mat1[i][j];
   System.out.print(mat2[i][j]);
}

System.out.println();
}
}
}