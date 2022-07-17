txt = input()

#your code goes here
txt=txt.split(' ')
print(max(txt,key=len))