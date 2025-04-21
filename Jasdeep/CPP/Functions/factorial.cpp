#include<iostream>
using namespace std;

int factorial(int n) {
    if (n == 0) return 1;  // Base case
    return n * factorial(n - 1);  // Recursive case
}

int main (){

    cout<<factorial(5);

    return 0;
}