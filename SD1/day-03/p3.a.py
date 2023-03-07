number = int(input("Enter 1 to convert °C to °F or 2 for the opposite: "))  
if number==1: 
    c = float(input("What is the temprature in °C ?"))
    output = (c * 1.8) + 32
elif number==2: 
    f = float(input("What is the temprature in °F ?"))
    output = (f - 32) / 1.8 
else:
    output = str("Invalid input")

print(output)