operator = str(input("What do you wanna do? ( `+', `-', `*' or `/' ): "))
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
if operator=="+":
    output = num1 + num2
elif operator=="-":
    output = num1 - num2
elif operator =="*":
    output = num1 * num2
elif (operator =="/") and (num2!=0):
    output = num1 / num2
else: output = "Error"

print(output)
