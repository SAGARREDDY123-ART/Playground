#include<iostream>
using namespace std;
int main()
{
int a;
  cin>>a;
  int ans=2,add=6;;
  if(a>=1)
  {
    cout<<0<<" ";
  }
  if(a>=2)
  {
    cout<<2<<" ";
  }
  for(int i=3;i<=a;i++)
  {
    ans=ans+add;
    cout<<ans<<" ";
   if(i%2==0) 
     add=add+4;
     
  }
}
