import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int gcd=0;
    Scanner s=new Scanner(System.in);
    double a=s.nextDouble();double b=s.nextDouble();double c=s.nextDouble();double d=s.nextDouble();
    int m=(int)Math.min(a,b);
    int n=(int)Math.min(m,c);
    for(int i=1;i<=n;i++)
    {
      if(a%i==0&&b%i==0&&c%i==0)
        gcd=i;
    }
    if(gcd==d)
      System.out.println("Answer is correct.");
    else
            System.out.println("Answer is wrong.");
  }
}