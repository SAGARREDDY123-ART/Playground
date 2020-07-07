#include<iostream>
using namespace std;
int main()
{
  int a,b,c,lcm;
  int sec_max,least;
  cin>>a>>b>>c;
  if(a>b&&a>c)
  {
    if(b>c)
      sec_max=b,least=c;
    else
      sec_max=c,least=b;
      
  }
else if(b>a&&b>c)
  {
    if(a>c)
      sec_max=a,least=c;
    else
      sec_max=c,least=a;
  }
else if(c>a&&c>b)
{
  if(a>b)
    sec_max=a,least=b;
  else
    sec_max=b,least=a;
}
  cout<<"The treasure is in box which has number "<<sec_max<<"\n";
  
  //finding hcf
  for(int i=1;i<=least;i++)
  {
    if(a%i==0&&b%i==0&&c%i==0)
      lcm=i;
    
  }
  cout<<"The code to open the box is "<<lcm;
}

    