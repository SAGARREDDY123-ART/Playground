import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
  int r,c,sumr=0,sumc=0,max=0;
  r=s.nextInt();
  c=s.nextInt();
  int arr[][]=new int[r][c];
  int row[]=new int[r];
  int col[]=new int[c];
  System.out.print("Sum of rows is ");
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      arr[i][j]=s.nextInt();
      sumr=sumr+arr[i][j];
    }
   System.out.print(sumr+" ");
   max=Math.max(max,sumr);
   row[i]=sumr;
    sumr=0;
  }
    System.out.println("");
  for(int i=0;i<r;i++)
  {
    if(row[i]==max)
    {
      System.out.println("Row "+(i+1)+" has maximum sum");
        break;
    }
  }
  max=0;
  System.out.print("Sum of columns is ");
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      sumc=sumc+arr[j][i];
    }
   System.out.print(sumc+" ");
   max=Math.max(max,sumc);
   col[i]=sumc;
    sumc=0;
  }
    System.out.println("");
  for(int i=0;i<c;i++)
  {
    if(col[i]==max)
    {
      System.out.println("Column "+(i+1)+" has maximum sum");
        break;
    }
  }  
    
}
  }
