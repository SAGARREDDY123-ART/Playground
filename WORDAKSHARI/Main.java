import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int i;
    Scanner s=new Scanner(System.in);
    String a[]=new String[20];
    for(i=0;i<20;i++)
    {
      a[i]=s.nextLine();
      if(a[i].equals("####"))
         break;
    }
    System.out.println(a[0]);
    for(int j=1;j<=i;j++)
    {
     int b=a[j-1].length();
      char ch=a[j-1].charAt(b-1);
      char chh=a[j].charAt(0);
      if(ch==chh)
        System.out.println(a[j]);
      else
        break;
    }
  }
}