#include <iostream>
using namespace std;
int swap(int &c,int &d);
int main() 
{
  int a,b;
  cin>>a>>b;
    cout <<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  cout <<"After swapping a= "<<a<<" and b="<<b;
    return 0;
}
int swap(int &c,int &d)
{
  int temp;
  temp=c;
  c=d;
  d=temp;
}
