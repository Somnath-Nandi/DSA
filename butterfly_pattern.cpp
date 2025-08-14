#include<iostream>
using namespace std;

int main(){

    int n=8;
    for(int i=0;i<(n/2);i++){
        for(int j=0;j<i+1;j++){
            cout<<"* ";
        }
        for(int j=2;j<n-2*i;j++){
            cout<<"  ";
        }
        for(int j=0;j<i+1;j++){
            cout<<"* ";
        }
        cout<<endl;
    }
    for(int i=(n/2);i>=1;i--){
        for(int j=0;j<i;j++){
            cout<<"* ";
        }
        for(int j=n-2*i;j>0;j--){
            cout<<"  ";
        }
        for(int j=0;j<i;j++){
            cout<<"* ";
        }
        cout<<endl;
    }

    return 0;
}