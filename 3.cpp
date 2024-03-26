#include <iostream>
#include <cstring>
using namespace std;

const int tam = 5;

int main() {
	setlocale(LC_ALL, "Portuguese");
	int index[2], soma = 0;
	char percurso[20];
	int m[tam][tam] = { {0,115,227,448,72},
		{115,0,304,155,280},
		{227,304,0,236,91},
		{448,155,236,0,412},
		{72,280,91,412,0} };

	cout << "Insira o percurso: ";
	cin >> percurso;

	for (int i = 0; i < strlen(percurso); i++) {
		for (int j = 0; j < 2; j++) {
			if (percurso[i + j] == 'A')
				index[j] = 0;
			else if (percurso[i + j] == 'B')
				index[j] = 1;
			else if (percurso[i + j] == 'C')
				index[j] = 2;
			else if (percurso[i + j] == 'D')
				index[j] = 3;
			else if (percurso[i + j] == 'E')
				index[j] = 4;
			else
				i = strlen(percurso);
		}
		if (i < strlen(percurso)) {
			soma = soma + m[index[0]][index[1]];
		}
	}

	cout << endl << "Distância à percorrer: " << soma << "km";

	return 0;
}
