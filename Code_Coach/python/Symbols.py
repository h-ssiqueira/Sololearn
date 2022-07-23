import re
str=input()

str=re.sub('[^0-9a-zA-Z.\d\s]','',str)
print(str)