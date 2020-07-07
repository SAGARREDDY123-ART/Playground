#include<iostream>
using namespace std;
int main()
{
  int a,male=0,fema=0;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
      fema++;
    else
      male++;
    
  }
  cout<<male<<"\n";
  cout<<fema;
}
  
