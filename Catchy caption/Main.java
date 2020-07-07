import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int w=1;
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    for(int i=0;i<a.length();i++)
    {
      if((int)a.charAt(i)==32)
        w++;
    }
    if(w>10)
      System.out.println("Caption not eligible for the contest");
    else
      System.out.println("Caption eligible for the contest");
  }
}