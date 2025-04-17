#include <iostream>  
using namespace std;  
int main()
{  
  int n, i, m=0, flag=0;  
  cout << "Enter the Number to check Prime: ";  
  cin >> n;  
  if(n == 1) {
  	flag = 1;
  	cout<<"No"<<endl;
  }
  for(i = 2; i < n; i++)  
  {  
      if(n % i == 0)  
      {  
          cout<<"NO"<<endl;  
          flag=1;  
          break;  
      }  
  }  
  if (flag==0){  
      cout << "YES"<<endl;
  }  
  return 0;  
}