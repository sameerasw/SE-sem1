n = input("Please enter an integer: ") 
try: 
    n = int(n) 
    print(n) 
except ValueError: 
    print("Requires a valid integer!")