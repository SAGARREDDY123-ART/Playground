import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   String a=s.next();
   int b=a.length();int even=0;int odd=0;
    for(int i=0;i<b;i++)
    {
      char ch=a.charAt(i);
      int c=Character.getNumericValue(ch);
      if(i%2==0)
        odd=odd+c;
      else
        even=even+c;
      
    }
    if(odd==even)
      System.out.println("Yes");
    else
            System.out.println("No");

  }
}