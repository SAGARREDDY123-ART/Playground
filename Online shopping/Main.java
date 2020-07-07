#include<iostream>
using namespace std;
int main()
{
int f_a,f_d,f_s,s_a,s_d,s_s,a_a,a_d,a_s;
  int f_final,s_final,a_final;
  cin>>f_a>>f_d>>f_s>>s_a>>s_d>>s_s>>a_a>>a_d>>a_s;
  f_final=f_a-(f_a*f_d/100)+f_s;
  s_final=s_a-(s_d*s_a/100)+s_s;
  a_final=a_a-(a_d*a_a/100)+a_s;
  cout<<"In Flipkart Rs."<<f_final<<"\n";
  cout<<"In Snapdeal Rs."<<s_final<<"\n";
  cout<<"In Amazon Rs."<<a_final<<"\n";
  if(f_final<s_final&&f_final<a_final)
    cout<<"He will prefer Flipkart";
  else if(f_final==s_final && s_final<a_final)
    cout<<"He will prefer Flipkart";
  else if(s_final<a_final)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}