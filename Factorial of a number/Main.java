#include<iostream>
using namespace std;
int main()
{
  int a,res=1;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    res=res*i;
  }
  cout<<res;
}