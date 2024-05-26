int main() {
setlocale(LC_ALL, "Portuguese");
int n = 0;

do {
cout << "Quantos? ";
cin >> n;
} while (n <= 0);

int* v = new int[n];

for (int i = 0; i < n; i++) {
v[i] = 0;
}

for (int i = 0; i < n; i++) {
do {
cout << i << "º valor: ";
cin >> v[i];
} while (v[i] <= 0);
}

int maior = v[0];
for (int i = 0; i < n; i++) {
if (v[i] > maior)
maior = v[i];
}
cout << endl << "maior elemento: " << maior << endl;

for (int i = 0; i < n; i++) {
v[i] = (v[i] / maior);
}

cout << endl << "resultante: ";
for (int i = 0; i < n; i++) {
cout << endl << v[i] << endl;
}

return 0;
}
