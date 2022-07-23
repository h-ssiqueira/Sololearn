import re
import math
x=1
z=0
str=input()
y=len(str)
for i in range(y):
   if ord(str[i]) == 32:
      x+=1
   elif (ord(str[i])>64 and ord(str[i])<91) or (ord(str[i])>96 and ord(str[i])<123):
      z+=1

print(math.ceil(z/x))