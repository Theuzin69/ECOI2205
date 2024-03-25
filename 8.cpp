/*(8) Fa¸ca uma fun¸c~ao em C++ denominada ordenaCrescente que receba dois par^ametros:
um vetor de n´umeros reais e o seu tamanho, e modifique a ordem dos elementos deste vetor
(caso necess´ario) para que eles fiquem ordenados em ordem crescente.Use uma fun¸c~ao int
main() para testar a fun¸c~ao ordenaCrescente com valores definidos pelo usu´ario.*/
#include <iostream>
using namespace std;

void ordenaCrescente(int v[], int tam) {
	cout << "Ordenando..." << endl;
	int j, aux;
	for (int i = 1; i < tam; i++) {
		aux = v[i];
		j = i;
		while (j > 0 && v[j - 1] > aux) {
			v[j] = v[j - 1];
			j--;
		}
		v[j] = aux;
	}
}

int main() {
	setlocale(LC_ALL, "pt_br");
	int n;

	cout << "n: ";
	cin >> n;
	int* v = new int[n];

	for (int i = 0; i < n; i++) {
		cout << i + 1 << "º valor: ";
		cin >> v[i];
	}

	ordenaCrescente(v, n);

	for (int i = 0; i < n; i++) {
		cout << endl << i + 1 << "º valor: " << v[i];
	}

	return 0;
}
