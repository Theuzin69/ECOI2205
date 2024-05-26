/*(9) Fa¸ca uma fun¸c~ao em C++ que receba 4 par^ametros: um vetor de inteiros, o seu tamanho,
um n´umero inteiro A delimitando o in´ıcio de um intervalo e outro n´umero B delimitando o
fim deste intervalo. Esta fun¸c~ao dever´a retornar verdadeiro caso todos os elementos do vetor
perten¸cam ao intervalo [A; B] ou falso caso contr´ario. Implemente uma fun¸c~ao int main()
para testar a fun¸c~ao acima. Obs.: Seu programa deve garantir que A ≤ B*/
#include <iostream>
using namespace std;

bool pertenceAB(int array[], int tam, int A, int B) {
	bool pertence = true;
	for (int i = 0; i < tam; i++) {
		if (array[i]<A or array[i] > B)
			return !pertence;
	}
	return pertence;
}

int main() {
	setlocale(LC_ALL, "pt_br");
	
	int n, A, B;
	cout << "Insira o tamanho do vetor: ";
	cin >> n;
	int* v = new int[n];

	for (int i = 0; i < n; i++) {
		cout << i + 1 << "º elemento: ";
		cin >> v[i];
	}

	cout << endl<<"Insira o início do intervalo: ";
	cin >> A;
	do {
		cout << endl << "Insira o fim do intervalo: ";
		cin >> B;
		if (B < A)
			cout << "B deve ser maior ou igual a A";
	} while (B < A);
	
	if (pertenceAB(v, n, A, B))
		cout << "Todos os valores do vetor pertencem ao intervalo!";
	else
		cout << "O vetor possui valores que não se enquadram no intervalo!";

	return 0;
}
