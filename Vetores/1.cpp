int main() {
setlocale(LC_ALL, "Portuguese");
int n;

cout << "quantos? ";
cin >> n;
int* v = new int[n];

for (int i = 0; i < n; i++) {
cout << i << "º valor: ";
cin >> v[i];
}

for (int i = 0; i < n; i++) {
cout << v[i] << endl;
}

return 0;
}
