#include<iostream>
using namespace std;
int main()
{
  int a,b,res=0;
  cin>>a>>b;
  for(int i=a+1;i<b;i++)
  {
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
        res=res+j;
    }
     if(res==i)
    {
      cout<<i<<" ";
    }
     res=0;
    
  }
  
  }
  
