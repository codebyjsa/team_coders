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

    int x;
    cout << "Enter the element to search: ";
    cin >> x; // Input the element to search in the array
    bool flag = false;
    for (int i=0; i<n-1; i++) {
        if(arr[i] == x) flag=true;
    }
    if (flag) {
        cout << "Element found in the array." << endl; // Print if the element is found
    } else {
        cout << "Element not found in the array." << endl; // Print if the element is not found
    }

    return 0;
}