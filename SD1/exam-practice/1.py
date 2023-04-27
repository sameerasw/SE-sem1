s = "Hello"
b = 0
try:
    b = int(s)
except:
    b = -1
print(b)

registered = True
if registered:
    print("Welcome")
else:
    print("Please register")

string = '''This is a
multi line string'''

print(string)