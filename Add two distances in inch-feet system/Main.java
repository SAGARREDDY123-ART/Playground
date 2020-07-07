#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3;
  float i1,i2,i3,i;
  cin>>f1>>i1>>f2>>i2;
  f3=f1+f2;
  i3=i1+i2;
  if(i3>=12)
  {
    f3=f3+1;
     i=i3-12;
  }
  else
    i=i3;
  cout<<f3<<"'"<<"-"<<i<<"\"";
  
}