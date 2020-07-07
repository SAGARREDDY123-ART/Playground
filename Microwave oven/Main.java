#include<iostream>
using namespace std;
int main()
{
  int items;
  float heat_time;
  cin>>items>>heat_time;
  if(items>3)
    cout<<"Number of items is more";
  else if(items==2)
    cout<<(heat_time*1.5);
  else
    cout<<(heat_time*2);
  
    
    
}