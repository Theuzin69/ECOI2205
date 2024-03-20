#include <iostream>
using namespace std;

int main() {
    setlocale(LC_ALL, "Portuguese");
    int n, aux, m = 0;
    cout << "Insira n: ";
    cin >> n;
    int* v = new int[n];

    for (int i = 0; i < n; i++) {
        cout << endl << i + 1 << "º valor: ";
        cin >> v[i];
    }

    int* counter = new int[n];
    for (int i = 0; i < n; i++)
        counter[i] = 0; //zero em todo array

    for (int i = 0; i < n; i++) {
        aux = v[i];
        for (int j = i; j < n; j++) {
            if (aux == v[j])
                counter[i]++;
        }
    }

    aux = counter[0];
    for (int i = 0; i < n; i++) {
        if (counter[i] > aux) {
            aux = counter[i];
            m = i;
        }
    }

    for (int i = 0; i < n; i++) {
        if (counter[i]==counter[m]) {
            cout << endl << "Moda: " << v[i];
        }
    }
}
