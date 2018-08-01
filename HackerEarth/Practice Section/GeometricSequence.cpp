#include <bits/stdc++.h>
using namespace std;

int main(){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, ele;
    vector<int> arr;
    cin >>n;
    for(int i=0; i<n; i++){
    	cin>>ele;
    	arr.push_back(ele);
    }
    cout <<arr[2] <<endl;
	return 0;
}