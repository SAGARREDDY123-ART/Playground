#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,res;
  cin>>a>>b;
  int a_m=a+1900;
  int b_m;
  if(b>a)
  {
    b_m=b+1900;
  }
  else
    b_m=b+2000;
  cout<<(b_m-a_m);
}