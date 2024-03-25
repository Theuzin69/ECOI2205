/*(2) Fa¸ca um programa onde o usu´ario defina as dimens~oes de uma matriz m × n, preencha
esta matriz com valores inteiros, calcule e mostre quais elementos da matriz se repetem e
quantas vezes s~ao repetidos.*/
#include <iostream>
using namespace std;

void insertionSort(int v[], int tam) {
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
	
	int m, n, irep=0;
	cout << "Defina as dimensões da matriz: " << endl << "m: ";
	cin >> m;
	cout << "n: ";
	cin >> n;
	
	int *repetidos=new int[m * n];

	int** A = new int* [m];
	for (int i = 0; i < m; i++)
		A[i] = new int[n];

	cout <<endl<< "Matriz A: ";
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			cout << "[" << i + 1 << "," << j + 1 << "]";
			cin >> A[i][j];
			repetidos[irep] = A[i][j];
			irep++;
		}
	}

	insertionSort(repetidos, sizeof(repetidos));

	for (int i = 0; i < sizeof(repetidos); i++) {
		int j = 1;
		while (repetidos[i] == repetidos[i + 1]) {
			j++;
			i++;
		}
		if(j>1)
			cout << endl << repetidos[i] << " se repete " << j << " vezes.";
	}

	return 0;
}
