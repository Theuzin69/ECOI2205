/*(10) Fa¸ca um programa onde o usu´ario armazene os elementos dos conjuntos A; B ⊂ Z :
jAj > jBj em dois vetores e ent~ao use uma fun¸c~ao que receba estes vetores (e seus respectivos
tamanhos) como par^ametros e retorne verdadeiro se B ⊆ A ou falso caso contr´ario.*/
#include <iostream>
using namespace std;

bool BCA(int a[], int b[], int tamA, int tamB) {
	bool contem = false;
	int j;
	for (int i = 0; i < tamB; i++) {
		j = 0;
		while (!contem and j < tamA) {
			if (b[i] == a[j])
				contem = true;
			else
				j++;
		}
		if (!contem)
			return false;
	}
	return true;
}

int main() {
	setlocale(LC_ALL, "pt_br");

	int tA, tB;
	double moduloA = 0, moduloB = 0;
	cout << "(Aviso) O vetor A deve ter módulo maior que o módulo do vetor B" << 
		endl << "Insira o tamanho do vetor A: ";
	cin >> tA;
	int* A = new int[tA];
	for (int i = 0; i < tA; i++) {
		cout << i + 1 << "º elemento: ";
		cin >> A[i];
	}

	cout << "Insira o tamanho do vetor B: ";
	cin >> tB;
	int* B = new int[tB];
	for (int i = 0; i < tB; i++) {
		cout << i + 1 << "º elemento: ";
		cin >> B[i];
	}

	for (int i = 0; i < tA; i++) {
		moduloA = moduloA + (A[i] * A[i]);
	}
	moduloA = sqrt(moduloA);
	for (int i = 0; i < tB; i++) {
		moduloB = moduloB + (B[i] * B[i]);
	}
	moduloB = sqrt(moduloB);

	if (moduloA > moduloB) {

		if (BCA(A, B, tA, tB))
			cout << "\"B contido em A\" é verdadeiro!";
		else
			cout << "\"B contido em A\" é falso!";
	}
	else
		cout << "O módulo de B é maior que o módulo de A";

	delete[] A;
	delete[] B;

	return 0;
}
