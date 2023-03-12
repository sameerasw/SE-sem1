hidden = "-9"
i = 0
sum = 0
score = input("enter a score: ")

try:
    int(score)
except ValueError:
    print("Enter a valid integer!")

print("You Successfully entered a valid integer!")

while score != hidden:
    score = input("enter a score: ")
    i =i+1
    sum = sum + int(score)
if i != 0:
    average = sum/i
else:
    average = hidden

print("You entered",i,"scores","The average is",average)