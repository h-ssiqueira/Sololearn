#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char x[30],aux,y[11];
    int i = 0;
    scanf("%[^\n]s",x);
    x[0] = toupper(x[0]);
    if(x[0] >= 48 && x[0] <= 57){
        if(x[1] != '/' && x[4] != '/'){
            aux = x[0];
            x[0] = x[3];
            x[3] = aux;
            aux = x[1];
            x[1] = x[4];
            x[4] = aux;
        }
        else if(x[1] == '/' && x[3] == '/'){
            aux = x[0];
            x[0] = x[2];
            x[2] = aux;
        }
        else if(x[1] == '/' && x[3] != '/'){
            aux = x[0];
            x[0] = x[1];
            x[1] = aux;
            aux = x[0];
            x[0] = x[2];
            x[2] = aux;
            aux = x[1];
            x[1] = x[3];
            x[3] = aux;
        }
        else{
            aux = x[2];
            x[2] = x[3];
            x[3] = aux;
            aux = x[0];
            x[0] = x[2];
            x[2] = aux;
            aux = x[1];
            x[1] = x[3];
            x[3] = aux;
        }
        printf("%s",x);
    }
    else{
        if(x[strlen(x)-8] != ' ')
            y[i++] = x[strlen(x)-8];
        y[i++] = x[strlen(x)-7];
        y[i++] = '/';
        if(x[0] == 'O' || x[0] == 'N' ||x[0] == 'D')
            y[i++] = '1';
        switch(x[0]){
            case 'A': x[1] == 'u' ? (y[i++] = '8') : (y[i++] = '4'); break;
            case 'S': y[i++] = '9'; break;
            case 'D':
            case 'F': y[i++] = '2'; break;
            case '0': y[i++] = '0'; break;
            case 'M': x[2] == 'r' ? (y[i++] = '3') : (y[i++] = '5'); break;
            case 'N': y[i++] = '1'; break;
            case 'J': x[3] == 'u' ? (y[i++] = '1') : (x[3] == 'e' ? (y[i++] = '6') : (y[i++] = '7')); break;
        }
        y[i++] = '/';
        y[i++] = x[strlen(x) - 4];
        y[i++] = x[strlen(x) - 3];
        y[i++] = x[strlen(x) - 2];
        y[i++] = x[strlen(x) - 1];
        y[i++] = 0;
        printf("%s",y);
    }

    return 0;
}