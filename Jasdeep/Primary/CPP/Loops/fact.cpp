#include<iostream>
using namespace std;

int main (){

    int n, product = 1 ;
    cin>>n;

    if (n==0 || n==1)
    {
        cout<<1;
    }
    else
    {
        for (int i = 1; i <= n; i++)
        {
            product*=i;
        }
        cout<<product<<endl;
    }
    
    

    return 0;
}