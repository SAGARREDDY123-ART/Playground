import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String b="";
    for(int i=0;i<a.length();i++)
    {
      char ch=a.charAt(i);
      int c=(int)ch;
      if((c>=97&&c<=(97+25))||(c>=65&&c<=(65+25)))
        b=b+ch;
    }
    System.out.println(b);
  }
}