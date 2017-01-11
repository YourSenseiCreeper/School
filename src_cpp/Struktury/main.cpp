#include <iostream>

using namespace std;

struct student
{
    string imie;
    string nazwisko;
    int wiek;
    int rok;
    float stn;
    float sts;
};

int main()
{
    student a[5];

    for(int i = 0; i<5; i++){
        cout << "Podaj imie: "<< endl;
        cin >> a[i].imie;
        cout << "Podaj nazwisko: "<<endl;
        cin >> a[i].nazwisko;
        cout << "Podaj wiek: " << endl;
        cin >> a[i].wiek;
        cout << "Podaj wysokosc stypendium naukowego: " << endl;
        cin >> a[i].stn;
        cout << "Podaj wysokosc stypendium socjalnego: " << endl;
        cin >> a[i].sts;
    }

    for (int i = 0; i<5; i++){
        cout << a[i].imie << " " << a[i].nazwisko << " " << a[i].rok << " " << a[i].wiek << " " << a[i].stn
        << a[i].sts << endl;
    }

    string dl;
    for (int i = 0; i<5; i++){
            dl = a[i].nazwisko;
        if(dl[dl.size()-1] == 'i'){
            cout << dl << endl;
        }
    }


    return 0;
}
