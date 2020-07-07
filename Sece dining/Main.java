#include<iostream>
using namespace std;
int main()
{
  char a[5];
  int b;
  cin>>a>>b;
  if(a[0]=='f')
  {
    if(b==1)
      cout<<"Left Handed";
    else 
      cout<<"Right Handed";
  }
  else if(a[0]=='r')
  {
    if(b==1)
      cout<<"Right Handed";
    else 
      cout<<"Left Handed";
  }
  }
