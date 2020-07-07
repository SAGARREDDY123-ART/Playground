import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int r,c,sum=0;
    r=s.nextInt();
    c=s.nextInt();
    int arr[][]=new int[r][c];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
     arr[i][j]=s.nextInt();
     sum=sum+arr[i][j];
   }
   System.out.println(sum);
   sum=0;

  }
}
}