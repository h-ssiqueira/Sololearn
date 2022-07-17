function main() {
    var depth = parseInt(readLine(), 10);
    //your code goes here
    var x,y
    x ^= x
    y ^= y

    while(depth > x){
        x+=7
        y++
        if(depth <= x) break
        else x-= 2
    }
    console.log(y)
}

