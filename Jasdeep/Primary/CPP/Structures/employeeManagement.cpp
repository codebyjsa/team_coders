#include<iostream>
using namespace std;

struct employee {
    int employeeID;
    char name[100];
    int age;
    float grade;
};

void employeeInput(employee employees[], int n){
    for (int i = 0; i < n; i++)
    {
        cout<<"Enter the details for the employee "<<i+1<<endl;
        cout<<"employee's ID: ";
        cin >> employees[i].employeeID;
        cin.ignore();
        cout<<"employee's Name: ";
        cin.getline(employees[i].name, 100);
        cout<<"Age: ";
        cin>>employees[i].age; 
        cout<<"Grades: ";
        cin>>employees[i].grade;
        cout<< endl;
    }    
}

void employeeDisplay(employee employees[], int n){
    for (int i = 0; i < n; i++)
    {
        cout<<"employee ID: "<<i+1<<endl;
        cout<<"Name: "<<employees[i].name<<endl;
        cout<<"Age: "<<employees[i].age<<endl;
        cout<<"Grades: "<<employees[i].grade<<endl;
        cout<<endl;
    }
}

void deleteemployeeRecord(employee employees[], int &n) {
    int idToDelete;
    cout << "Enter the employee ID to delete: ";
    cin >> idToDelete;

    int indexToDelete = -1;
    for (int i = 0; i < n; ++i) {
        if (employees[i].employeeID == idToDelete) {
            indexToDelete = i;
            break;
        }
    }

    if (indexToDelete == -1) {
        cout << "employee with ID " << idToDelete << " not found.\n";
        return;
    }

    for (int i = indexToDelete; i < n - 1; ++i) {
        employees[i] = employees[i + 1];
    }

    n--;

    cout << "employee with ID " << idToDelete << " has been deleted.\n";
}

void updateemployeeRecord(employee employees[], int n) {
    int idToUpdate;
    cout << "Enter the employee ID to update: ";
    cin >> idToUpdate;

    int indexToUpdate = -1;
    for (int i = 0; i < n; ++i) {
        if (employees[i].employeeID == idToUpdate) {
            indexToUpdate = i;
            break;
        }
    }

    if (indexToUpdate == -1) {
        cout << "employee with ID " << idToUpdate << " not found.\n";
        return;
    }

    cout << "Updating details for employee ID " << idToUpdate << ":\n";
    cout << "Enter new name: ";
    cin >> employees[indexToUpdate].name;
    cout << "Enter new age: ";
    cin >> employees[indexToUpdate].age;
    cout << "Enter new grade: ";
    cin >> employees[indexToUpdate].grade;

    cout << "employee details updated successfully!\n";
}

void employeeSearch(employee employees[], int n){
    int idToSearch;
    cout << "Enter the employee ID to update: ";
    cin >> idToSearch;

    int indexToSearch = -1;
    for (int i = 0; i < n; ++i) {
        if (employees[i].employeeID == idToSearch) {
            indexToSearch = i;
            break;
        }
    }

    if (indexToSearch == -1) {
        cout << "employee with ID " << idToSearch << " not found.\n";
        return;
    }

    cout<<"employee ID: "<<indexToSearch+1<<endl;
        cout<<"Name: "<<employees[indexToSearch].name<<endl;
        cout<<"Age: "<<employees[indexToSearch].age<<endl;
        cout<<"Grades: "<<employees[indexToSearch].grade<<endl;
        cout<<endl;


}


int main (){

    int n;
    cout<<"Enter the number of employees: ";
    cin>>n;
    employee employees[n];

    employeeInput(employees, n);
    employeeDisplay(employees, n);
    deleteemployeeRecord(employees, n);
    updateemployeeRecord(employees, n);
    employeeSearch(employees, n);


    return 0;
}