import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuilder strb=new StringBuilder(str);
    int len=strb.length();
    int l=0;
    while(strb.toString().contains("the"))
    {
      int index=strb.indexOf("the");
      if(index==-1)
        break;
      else
        strb.delete(index,index+4);
      }
    System.out.println(strb);
    
  }
}