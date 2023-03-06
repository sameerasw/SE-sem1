response = str(input("Do you like Python? (yes/no):"))
response = response.lower() 
if response=="yes":
    reply = "You are on the right course!"
elif response=="no":
    reply = "You might change your mind."
else:
    reply = "I did not understand."

print(reply)