#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float dis,final,inte;
  cin>>p>>r>>t;
  inte=(p*t*r)/100;
  cout<<inte<<"\n"<<(inte+p)<<"\n";
  dis=(inte/100)*2;
  cout<<dis<<"\n"<<((inte+p)-dis);
  
 }