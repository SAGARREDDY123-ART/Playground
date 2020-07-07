#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=0;
  cin>>a;
int d=1,f=a*(a+1);
  int e=(a*a)+1;
  for(int k=1;k<=a;k++)
  {
   while(b>0)
    {
     cout<<"-";
     b--;
    }
    
     
  for(int i=1;i<=(2*a-c);i++)
  { 
    if(i>(2*a-c)/2)
    {
    if(i==(2*a-c))
            cout<<e;
    else
       cout<<e<<"*";
    e++;
    f=e-1;
    }
    else 
    {
    if(i==(2*a-c))
    cout<<d;
    else
       cout<<d<<"*";
    d++;
    }
  }
    b=c+2;
    c=b;
    f=f-(2*a-c);
    e=f;
    printf("\n");
  
}
}