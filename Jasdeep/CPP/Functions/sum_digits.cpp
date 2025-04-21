// Calculate the sum of the digits of number.
#include<iostream>
using namespace std;

int sum_dig(int num){

    int number = 0;
    while (num>0)
    {   
        int last_dig = num%10;
        num /= 10;
        number += last_dig;
        
    }
    return number;
}

int main(){

    int num;
    cin>>num;

    cout<<sum_dig(num)<<endl;

    return 0; 
}