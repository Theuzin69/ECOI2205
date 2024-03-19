#include <iostream>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int n;
    cout<<"Insira n: ";
    cin>>n;
    int *v = new int[n];

    for(int i=0;i<n;i++){
        cout<<endl<<i+1<<"º valor: ";
        cin>>v[i];
    }

    int comp, tamModa=n;
    for(int j=0;j<n;j++){
    for(int i=0;i<n;i++){
        if(comp=v[i]){
            tamModa--;
        }
    }
    }
    int *moda = new int[2][n];
    for(int i=0;i<n;i++){

    }
}
