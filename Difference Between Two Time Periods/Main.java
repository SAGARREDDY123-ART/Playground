#include<iostream>
using namespace std;
int main()
{
int h1,m1,s1,h2,m2,s2;
cin>>h1>>m1>>s1>>h2>>m2>>s2;
//cout<<"TIME DIFFERENCE"<<"\n";
int s3,m3,h3;
if(s2>s1)
{
  s1=s1+60;
  s3=s1-s2;
  m1=m1-1;
}
else
{s3=s1-s2;
}
if(m2>m1)
{
  m1=m1+60;
  m3=m1-m2;
  h1=h1-1;
}
 else
 {
   m3=m1-m2;
 }
  h3=h1-h2;
    cout<<h3<<":"<<m3<<":"<<s3;
}