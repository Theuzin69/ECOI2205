int main() {
setlocale(LC_ALL, "Portuguese");
int n, x, soma=0;
cout << "Valor de n: ";
cin >> n;
int* v = new int[n];

for (int i = 0; i < n; i++) {
cout << i << "º coeficiente: ";
cin >> v[i];
}

int i = 0;
do {
cout << endl << "Valor de x: ";
cin >> x;
v[i] = v[i] * pow(x, n-i);
i++;
} while (x && i < n);

for (int i = 0; i < n; i++) {
soma = soma + v[i];
}

return 0;
}
