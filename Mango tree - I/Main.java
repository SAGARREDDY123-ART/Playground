#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  int tfc=c+1;//tree first column
  int tlc=2*c;//tree last column
  if(t>=1&&t<=c)
  {
    cout<<"Yes";
    goto sai;
  }
  else 
  {
    for(int j=0;j<=r-1;j++)
    {
      if(t==tfc||t==tlc)
      {
        cout<<"Yes";
              goto sai;

      }
      else
      {
        tfc=tfc+c;
        tlc=tlc+c;
      }
    }
  }
 cout<<"No";
  sai:
  {
  }
 }