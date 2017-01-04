#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    string line;
    fstream plik;
    int cnt = 0;
    int zoes = 0;
    int z,o = 0;
    int sorter[15];

    //Dodawanie wartosci
    for(int i=2; i<15; i++){
        sorter[i] = 0;
    }

    plik.open("napisy.txt",ios::in);

    while(!plik.eof()){
        z = 0;
        o = 0;

        plik >> line;

        if(line.size()%2 == 0){
            cnt++;
        }

        for(int i=0; i<=line.size(); i++){
            if(line[i] == '0') z++;
            if(line[i] == '1') o++;
        }

        if(z == o){
            zoes++;
        }

        sorter[line.size()-1]++;
        cout << line << endl;
    }
    plik.close();
    cout << "Liczba wierszy o parzystej d³ugosci to: " << cnt << endl;
    cout << "Liczba wierszy o tylu samych jedynkach i zerach: " << zoes << endl;

    for(int i = 0; i<15; i++){
        cout << i << "-znakowych: " << sorter[i] << endl;
    }

    return 0;
}
