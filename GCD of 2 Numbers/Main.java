#include<iostream>
using namespace std;
int gcd(int a,int b);
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int a,int b)
{
  if(a==0)
    return b;
  else if(b==0)
    return a;
  else if(a>b)
    return gcd(a%b,b);
  else if(b>a)
    return gcd(b%a,a);
}
  