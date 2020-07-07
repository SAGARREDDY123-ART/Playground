using namespace std;
#include<iostream>
int main()
{
 int a,meera;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  cin>>meera;
  for(int j=0;j<a;j++)
  {
    if(meera==arr[j])
    {
      cout<<"She passed her exam";
      goto sai;
    }
  }
  cout<<"She failed";
  sai:
  {
  }
  
 
}