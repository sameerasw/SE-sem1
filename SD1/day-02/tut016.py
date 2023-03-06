x=int(input("Divide?"))
try:
    print(6/x)
    print()
except ZeroDivisionError:
    print("Can’t divide by 0")