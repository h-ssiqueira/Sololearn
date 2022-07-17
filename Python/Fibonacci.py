num = int(input())


def fibonacci(n,x,y):
	#complete the recursive function
    if n == 0:
        return
    print(x)
    fibonacci(n-1,y,x+y)
fibonacci(num,0,1)