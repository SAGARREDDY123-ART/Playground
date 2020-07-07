#include<iostream>
using namespace std;
int main()
{
int c,count=0;
cin>>c;
cout<<c<<"\n";
while(c>1)
{
  if(c%2==0)
    c=c/2;
  else
    c=3*c+1;
  cout<<c<<"\n";
  count++;
}
  cout<<count;
}