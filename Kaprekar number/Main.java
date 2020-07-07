import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int res=num*num;
    String a=Integer.toString(res);
    int len=a.length();
    int c;
     c=(int)len/2;
    if(num>3)
    {
    String b=a.substring(0,c);
    String d=a.substring(c,len);
    int bm=Integer.parseInt(b);
    int dm=Integer.parseInt(d);
    if(num==(bm+dm))
      System.out.println("Kaprekar Number");
    else
      System.out.println("Not a Kaprekar Number");
   }
    else
      System.out.println("Not a Kaprekar Number");
}
}