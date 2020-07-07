import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String b;
    for(int i=a.length()-1;i>=0;i--)
    {
      System.out.print(a.charAt(i));
    }
    
  }
}