#include <iostream>
using namespace std;

int main() {
	setlocale(LC_ALL, "Portuguese");
	int m, n, o, aux;
	cout << "Dimensões da matriz: "<<endl<<"m: ";
	cin >> m;
	cout<< "n: ";
	cin >> n;
	cout<< "o: ";
	cin >> o;

	int** A = new int* [m];
	for (int i = 0; i < m; i++)
		A[i] = new int[n];
	int** B = new int* [n];
	for (int i = 0; i < n; i++)
		B[i] = new int[o];

	cout << "Matriz A: ";
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			cout << "[" << i+1 << "," << j+1 << "]";
			cin >> A[i][j];
		}
	}

	cout << "Matriz B: ";
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < o; j++) {
			cout << "[" << i+1 << "," << j+1 << "]";
			cin >> B[i][j];
		}
	}

	int** C = new int* [m];
	for (int i = 0; i < m; i++)
		C[i] = new int[o];

	for (int k=0;k<m;k++) {
		for (int i = 0; i < o; i++) {
			aux = 0;

			for (int j = 0; j < n; j++) {
				aux = aux + A[k][j] * B[j][i];
			}
			C[k][i] = aux;
		}
	}

	for (int i = 0;i<m;i++) {
		cout << endl;
		for (int j = 0; j < o; j++) {
			cout << C[i][j] << " ";
		}
	}

	for (int i = 0; i < m; i++)
		delete[] A[i];
	delete[]A;
	for (int i = 0; i < n; i++)
		delete[] B[i];
	delete[]B;
	for (int i = 0; i < m; i++)
		delete[] C[i];
	delete[]C;
}
