#include<iostream>
using namespace std;

void fact(int n){
    int product=1;
    if (n>=0){
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
    }
    else{
        cout<<"Invalid Input!";
    }
}

int main (){

    int n;
    cin>>n;

    fact(n);    

    return 0;
}