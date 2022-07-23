import re
x=input()
x=re.sub(r'[^A-Za-z ]+','',x)
y=len(x)
print(x[y::-1])