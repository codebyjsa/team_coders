#include<iostream>
using namespace std;

int main () {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n; // Input the size of the array
    int arr[n]; // Declare an array of size n
    for(int i = 0; i < n; i++) {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i]; // Input each element of the array
    }
    int sum = 0;
    for(int i = 0; i < n; i++) {
        sum += arr[i]; // Calculate the sum of the array elements
    }
    cout << "Sum of the array elements: " << sum << endl; // Print the sum of the array elements
    return 0;
}