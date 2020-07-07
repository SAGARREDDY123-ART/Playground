#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=6;
  cout<<b<<" ";
  for(int i=2;i<=a;i++)
  {
    b=b+5*(i-1);
    cout<<b<<" ";
  }
  
}