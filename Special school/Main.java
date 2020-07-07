import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
  String a=s.nextLine();
  String b=s.nextLine();
  String c="";
   for(int i=b.length()-1;i>=0;i--)
   {
     c=c+b.charAt(i);
   }
    if(a.equals(c))
      System.out.println("It is correct");
    else
      System.out.println("It is wrong");
  }
}