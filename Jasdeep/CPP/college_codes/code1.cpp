#include <iostream>
#include <string>
using namespace std;

class Teacher {
public: 
    string name;
    string department;
    int id;
    double salary;
};

// Function to clear the input buffer
void clearInput() {
    cin.clear();
    cin.ignore(1000, '\n');
}

int main() {
    Teacher t1; 
    
    // Get teacher's name (can be multiple words)
    cout << "Enter teacher's full name: ";
    getline(cin, t1.name);
    
    // Get department (can be multiple words)
    cout << "Enter teacher's department: ";
    getline(cin, t1.department);
    
    // Get ID
    cout << "Enter teacher's ID: ";
    cin >> t1.id;
    
    // Get salary
    cout << "Enter teacher's salary: ";
    cin >> t1.salary;
    
    // Display information
    cout << "\n--- Teacher's Information ---" << endl;
    cout << "Name: " << t1.name << endl; 
    cout << "Department: " << t1.department << endl;
    cout << "ID: " << t1.id << endl; 
    cout << "Salary: " << t1.salary << endl; 
    
    return 0; 
}