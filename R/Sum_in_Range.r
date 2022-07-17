input <- readLines('stdin')
x <- as.integer(input[1])
y <- as.integer(input[2])

#define the function
rangeSum <- function(x,y){
    limit <- y
    while(x != limit){
        y <- y + x
        x <- x + 1
    }
    return(y)
}

result <- rangeSum(x, y)
print(result)