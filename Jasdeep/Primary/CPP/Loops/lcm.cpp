#include<iostream>
using namespace std;

int main(){

    int n1, n2, gcd;
    cin>>n1>>n2;

    if (n2>n1)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    for(int i = 1; i<=n2; i++){
        if (n1%i==0 && n2%i==0)
        {
            gcd = i;
        }
        
    }    

    int lcm = (n1*n2)/gcd;
    if (lcm<0)
    {
        lcm*=(-1);
    }
    cout<<lcm;
    

    return 0;
}