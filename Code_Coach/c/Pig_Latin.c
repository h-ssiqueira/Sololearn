#include <stdio.h>
#include <string.h>

int main(){
    char x[100],y[100],aux;
    int i,j;
    scanf("%[^\n]s",x);
    aux = x[0];
    for(i = 1,j = 0; i < strlen(x); i++){
        if(x[i] == ' '){
            if(x[i+1] != ' '){
                aux = x[i+1];
                y[j++] = x[i++];
            }
        }
        else if(x[i+1] == ' ' || x[i+1] == '\0' || x[i+1] == '\n'){
            y[j++] = x[i];
            y[j++] = aux;
            y[j++] = 'a';
            y[j++] = 'y';
        }
        else
            y[j++] = x[i];
    }
    y[j] = 0;
    printf("%s",y);
    return 0;
}