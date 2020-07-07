import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int v,c,w,d,s;
    v=c=w=d=s=0;
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    for(int i=0;i<a.length();i++)
    {
      char ch=a.charAt(i);
      int b=(int)ch;
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    	v++;
      else if((b>=65&&b<=(65+25))||(b>=97&&b<=(97+25)))
        c++;
      else if(b==32)
        w++;
      else if(b>=48&&b<=57)
        d++;
      else
        s++;
    }
    System.out.print("Vowels:"+v+"\n"+"Consonants:"+c+"\n"+"White Spaces:"+w+"\n"+"Digits:"+d+"\n"+"Symbols:"+s);
  }
}