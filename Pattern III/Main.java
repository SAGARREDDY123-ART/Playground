#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  cout<<"1"<<"\n";
  for(int i=2;i<=a;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(j==i)
        cout<<i;
      else
        cout<<i<<"*";
    }
    cout<<"\n";
  }
  
  for(int k=a;k>=1;k--)
  {
    for(int l=1;l<=k;l++)
    {
      if(l==k)
       cout<<k;
      else
        cout<<k<<"*";
    }
    cout<<"\n";
  }
  
}