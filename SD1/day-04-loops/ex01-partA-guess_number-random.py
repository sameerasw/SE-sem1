import random

hidden = 6
guess = random.randint(1, 20)
while guess != hidden:
    print("generated number: ", guess)
    if guess > hidden:
        print("Too high! Try again!")
    else:
        print("Too low! Try again!")
    guess = random.randint(1, 20)
print("You guessed it!")
