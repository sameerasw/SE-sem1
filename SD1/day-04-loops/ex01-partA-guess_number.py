hidden = 6
guess = int(input("Guess a number between 1 and 20: "))
while guess != int(hidden):
    print("Wrong! Try again!")
    guess = input("Guess a number between 1 and 20: ")
print("You guessed it!")