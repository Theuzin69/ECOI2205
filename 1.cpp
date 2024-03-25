/*(1) Na teoria dos sistemas, define-se MINMAX como sendo o maior elemento da linha onde
se encontra o menor elemento da matriz. Fa¸ca uma fun¸c~ao denominada minmax que receba
uma matriz de n´umeros reais de dimens~ao 5×6 e retorne o elemento MINMAX desta matriz.
Implemente tamb´em uma fun¸c~ao int main() para usar a func~ao minmax.*/
#include <iostream>
using namespace std;

const int o = 5;
const int p = 6;

int minmax(int matrix[][p]) {
	int aux1=matrix[0][0], aux2=0;
	for (int i = 0; i < o; i++) {
		for (int j = 0; j < p; j++) {
			if (matrix[i][j] < aux1) {
				aux1 = matrix[i][j];
				aux2 = i;
			}
		}
	}
	for (int i = 0;i<p;i++) {
		if (aux1 < matrix[aux2][i])
			aux1 = matrix[aux2][i];
	}

	return aux1;
}

int main() {
	setlocale(LC_ALL, "pt_br");
	
	int m[o][p];

	for (int i = 0; i < o; i++) {
		for (int j = 0; j < p; j++) {
			cout << "[ " << i+1 << " , " << j+1 << " ]: ";
			cin >> m[i][j];
		}
	}
	
	for (int i = 0; i < o; i++) {
		cout << endl;
		for (int j = 0; j < p; j++) {
			cout <<" "<< m[i][j];
		}
	}

	cout<<endl<<endl<<"MINMAX: " << minmax(m);

	return 0;
}
