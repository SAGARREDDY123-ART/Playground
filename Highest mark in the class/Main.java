import java.util.*;
class Main
{
  public static void main(String args[])
  {
   int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    int b[]=new int[a];
    int max=0;
    for(int i=0;i<a;i++)
    {
      b[i]=s.nextInt();
      max=Math.max(max,b[i]);
    }
          System.out.println(max);

  }

}