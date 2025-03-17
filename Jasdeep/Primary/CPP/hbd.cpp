#include <iostream>
#include <vector>
#include <windows.h>
#include <cstdlib>  

using namespace std;

void clearScreen() {
    system("CLS"); 
}

void animateArt(const vector<string>& art) {
    for (int i = 0; i < 10; ++i) {
        clearScreen();
        for (size_t j = 0; j < art.size(); ++j) {
            cout << art[j] << endl;
            Sleep(100);
        }
        Sleep(1000);
    }
}

int main() {
    cout << "Hi Mr. Ajit Singh this is your Son's friend Aishwarya Rai. I came to know you are big fan of mine :)" << endl;
    Sleep(5000);
    cout << "He asked me to do one thing for you." << endl;
    Sleep(5000);
    cout << "(Don't worry Mrs. Gurjit Kaur, I am just a bot :))" << endl;
    Sleep(5000);
    cout<<"So here it is... A surprise... for a amazing father and a husband in some coding style."<<endl;
    Sleep(5000);
    cout<<"In 5...";
    Sleep(1000);
    cout<<" 4...";
    Sleep(1000);
    cout<<" 3...";
    Sleep(1000);
    cout<<" 2...";
    Sleep(1000);
    cout<<" 1...";
    
    Sleep(2000); 
    
    clearScreen();
    
    vector<string> art = {
        "|||     |||          ||||          ||||||     ||||||    |||        |||",
        "|||     |||         ||||||         |||  |||   |||  |||   |||      |||",
        "|||     |||        |||  |||        |||    ||| |||    |||  |||    |||",
        "|||     |||       |||    |||       |||   |||  |||   |||    |||  |||",
        "|||||||||||      ||||||||||||      ||| |||    ||| |||       ||||||",
        "|||||||||||     ||||||||||||||     ||||||     ||||||         ||||",
        "|||     |||    |||          |||    |||        |||            ||||",
        "|||     |||   |||            |||   |||        |||            ||||",
        "|||     |||  |||              |||  |||        |||            ||||",
        "|||     ||| |||                ||| |||        |||            ||||",
        "",
        "||||||    ||||||||||||| ||||||       ||||||||||||| |||     ||| ||||||                  ||||          |||        |||",
        "|||  |||  ||||||||||||| |||  |||     ||||||||||||| |||     ||| |||  |||               ||||||          |||      |||",
        "|||    |||     |||      |||    |||        |||      |||     ||| |||    |||            |||  |||          |||    |||",
        "|||  |||       |||      |||   |||         |||      |||     ||| |||      |||         |||    |||          |||  |||",
        "||||||         |||      ||| |||           |||      ||||||||||| |||        |||      ||||||||||||          ||||||",
        "||||||         |||      ||||||            |||      ||||||||||| |||        |||     ||||||||||||||          ||||",
        "|||  |||       |||      ||||||            |||      |||     ||| |||      |||      |||          |||         ||||",
        "|||    |||     |||      |||  |||          |||      |||     ||| |||    |||       |||            |||        ||||",
        "|||  |||  ||||||||||||| |||    |||        |||      |||     ||| |||  |||        |||              |||       ||||",
        "||||||    ||||||||||||| |||      |||      |||      |||     ||| ||||||         |||                |||      ||||",
        "",
    
    };

    animateArt(art);

    return 0;
}
