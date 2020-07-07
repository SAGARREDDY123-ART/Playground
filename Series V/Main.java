#include<iostream>
using namespace std;
int main()
{
int a;
cin>>a;
int b=11;
if(a>=1)
{
  cout<<11*11<<" ";
}
  for(int i=2;i<=a;i++)
  {
    b=b+4;
    cout<<b*b<<" ";
  }
}