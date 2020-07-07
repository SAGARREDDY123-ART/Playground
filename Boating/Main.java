#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int adult=b*75;
  int children=c*30;
  int fin=adult+children;
  if(fin<a)
  {
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";}