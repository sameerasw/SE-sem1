marks = int(input('Enter your marks: '))  
if 100< marks < 0: 
    print("Invalid marks")
elif marks < 40: 
    print("Fail")  
else: 
    print("Pass")