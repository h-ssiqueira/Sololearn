import re
#your code goes here
x = input()
if (x[0] == '1') or (x[0] == '8') or (x[0] == '9'):
    if len(x) == 8:
        print("Valid")
    else:
        print("Invalid")
else:
    print("Invalid")
