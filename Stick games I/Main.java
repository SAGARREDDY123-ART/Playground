#include<iostream>
using namespace std;
int main()
{
int n,m,m_m,n_n;
cin>>n>>m;
  if(n>m)
{
     m_m=n;
     n_n=n;
}
  else if(m>n)
{
    n_n=m;
    m_m=m;
}
  else if(m==n)
  {
    m_m=m;
    n_n=n;
  }
    
 int row[m_m],col[n_n];
 for(int i=1;i<=n;i++)
 {
   row[i]=i;
 }
 for(int j=1;j<=m;j++)
 {
   col[j]=j;
 }
  if(n!=m)
  {
  for(int k=1;k<=m_m;k++)
  {
    if(row[k]!=col[k])
    {
      if(k%2==0)
      {
        cout<<"Arun Gupta";
        break;
      }
      else
      {
        cout<<"Mani Iyer";
        break;
      }
    }
  }
  }
  else
  {
    if(n%2==0)
      cout<<"Mani Iyer";
    else
      cout<<"Arun Gupta";
  }
  
}