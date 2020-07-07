import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
  int a,b,c,d,e;
  int re,im;
  a=s.nextInt();b=s.nextInt();c=s.nextInt();d=s.nextInt();e=s.nextInt();
  if(a>=1&&a<=3)
  {
    if(a==1)
    {
      re=b+d;
      im=c+e;
    }
    else if(a==2)
    {
      re=b-d;
      im=c-e;
    }
    else
    {
      re=(b*d)-(c*e);
      im=(b*e)+(c*d);
    }
  System.out.print(re);
  if(im>0)
  System.out.print("+"+im+"i");
  else
    System.out.print(im+"i");

  }

  else
    System.out.println("Invalid choice");
  }
}