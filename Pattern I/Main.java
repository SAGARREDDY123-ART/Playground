#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  cout<<a<<"\n";
  a=a+1;
  int b=(a-1)+4;
  for(int i=2;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<a;
    }
    cout<<"\n";
    a=a+1;
   }
a=a-1;
 for(int i=4;i>=1;i--)
  {
    for(int j=i;j>=1;j--)
    {
      cout<<a;
    }
    cout<<"\n";
    a=a-1;
   }
}
  