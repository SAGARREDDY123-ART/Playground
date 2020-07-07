#include<iostream>
using namespace std;
int main()
{
int c,d1=0,d2=0;
cin>>c;
 int arr[c][c];
  for(int i=0;i<c;i++)
  { 
   for(int j=0;j<c;j++)
   {
     cin>>arr[i][j];
     if(i==j)
       d1=d1+arr[i][j];
     if(i+j==c-1)
       d2=d2+arr[i][j];
   }
  }
  if(d1==d2)
    cout<<"Yes";
  else
    cout<<"No";
}