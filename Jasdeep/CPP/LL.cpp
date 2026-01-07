#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

Node* head = NULL;   // Global head pointer


// INSERT AT BEGINNING
void insertAtBeginning(int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = head;
    head = newNode;
}


// INSERT AT END
void insertAtEnd(int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL) {
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
}

Node* search(Node* head, int key) {
    Node* temp = head;

    while (temp != NULL) {
        if (temp->data == key)
            return temp;     // found
        temp = temp->next;
    }

    return NULL;             // not found
}


// INSERT AT SPECIFIC POSITION (1-based index)
void insertAtPosition(int value, int pos) {
    Node* newNode = new Node();
    newNode->data = value;

    // Insert at position 1
    if (pos == 1) {
        newNode->next = head;
        head = newNode;
        return;
    }

    Node* temp = head;
    int count = 1;

    // Traverse to pos-1
    while (temp != NULL && count < pos - 1) {
        temp = temp->next;
        count++;
    }

    if (temp == NULL) {
        cout << "Position out of range\n";
        return;
    }

    newNode->next = temp->next;
    temp->next = newNode;
}


// DELETE AT BEGINNING
void deleteAtBeginning() {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    Node* temp = head;
    head = head->next;
    delete temp;
}


// DELETE AT END
void deleteAtEnd() {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    // Only one node
    if (head->next == NULL) {
        delete head;
        head = NULL;
        return;
    }

    Node* temp = head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }

    delete temp->next;
    temp->next = NULL;
}


// DELETE AT SPECIFIC POSITION
void deleteAtPosition(int pos) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    // Delete 1st node
    if (pos == 1) {
        Node* temp = head;
        head = head->next;
        delete temp;
        return;
    }

    Node* temp = head;
    int count = 1;

    while (temp->next != NULL && count < pos - 1) {
        temp = temp->next;
        count++;
    }

    if (temp->next == NULL) {
        cout << "Position out of range\n";
        return;
    }

    Node* ptr = temp->next;
    temp->next = ptr->next;
    delete ptr;
}


// DISPLAY LIST
void display() {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    Node* temp = head;
    while (temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL\n";
}



// MAIN FUNCTION
int main() {
    insertAtBeginning(10);
    insertAtBeginning(20);
    insertAtEnd(30);
    insertAtEnd(40);

    cout << "List after insertions: ";
    display();

    insertAtPosition(25, 3);
    cout << "After inserting 25 at position 3: ";
    display();

    deleteAtBeginning();
    cout << "After deleting at beginning: ";
    display();

    deleteAtEnd();
    cout << "After deleting at end: ";
    display();

    deleteAtPosition(2);
    cout << "After deleting at position 2: ";
    display();

    return 0;
}