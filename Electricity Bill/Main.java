#include<iostream>
using namespace std;
int main()
{
  int a,res;
  cin>>a;
  if(a<=200)
    res=a*0.5;
  else if(a<=400)
    res=(a*0.65)+100;
  else if(a<=600)
    res=(a*0.80)+200;
  else
    res=(a*1.25)+425;
  cout<<"Rs."<<res;}