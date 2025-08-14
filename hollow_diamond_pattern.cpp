#include<iostream>
using namespace std;

int main(){

    int n=4;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i-1; j++){
            cout<<" ";
        }
        cout<<"*";
        for(int j=1; j<=2*i-1; j++){
            cout<<" ";
        }
        if(i!=1){
            cout<<"*";
        }
        cout<<endl;
    }
    
    for(int i=n-1; i>=1; i--){
        for(int j=0; j<=n-i-1; j++){
            cout<<" ";
        }
        cout<<"*";
        for(int j=1; j<=2*i-3; j++){
            cout<<" ";
        }
        if(i!=1){
            cout<<"*";
        }
        cout<<endl;
    }
    
    return 0;
}