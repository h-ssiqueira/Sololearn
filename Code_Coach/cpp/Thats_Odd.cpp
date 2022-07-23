#include <iostream>
using namespace std;

int main(){
    int t, s = 0, n;
    cin >> t;
    for (; t != 0; t--){
        cin >> n;
        if (n % 2 == 0)
            s += n;
    }
    cout << s;

    return 0;
}