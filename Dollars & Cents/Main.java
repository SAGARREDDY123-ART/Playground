#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int dollar=0;
  dollar=a+c;
  dollar=dollar+(b+d)/100;
  int cent=(b+d)%100;
  cout<<dollar<<"\n"<<cent;
}