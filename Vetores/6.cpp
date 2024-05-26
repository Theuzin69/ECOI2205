#include <iostream>
using namespace std;

int main() {
	setlocale(LC_ALL, "Portuguese");
	int n, aux;
	cout << "Insira n: ";
	cin >> n;
	int* v = new int[n];

	for (int i = 0; i < n; i++) {
		cout << endl << i + 1 << "º valor: ";
		do {
			cin >> v[i];
			if (v[i] < 0 or v[i]>100)
				cout << "Inválido!";
		} while (v[i] < 0 or v[i]>100);
	}

	for (int i = 1; i < n - 1; i++) {
		for (int j = 0; j < n - i; j++) {
			if (v[j] > v[j + 1]) {
				aux = v[j];
				v[j] = v[j + 1];
				v[j + 1] = aux;
			}
		}
	}

	for (int i = 0; i < n; i++) {
		int j = 1;
		while (v[i] == v[i + 1]) {
			j++;
			i++;
		}
		cout << endl << "Ocorrencias do " << v[i] << ": " << j;
	}

	delete[] v;
}
