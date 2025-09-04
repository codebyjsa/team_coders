#include <iostream>
using namespace std;

int main() {
    int arr[]={1,2,3,4,4,5,5,6,6,7,8,}; // Declare an array of size 10
    cout << "Size of the array: " << sizeof(arr) / sizeof(arr[0]) << endl; // Calculate and print the size of the array
    return 0;
}