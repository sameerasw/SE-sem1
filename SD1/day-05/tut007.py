secret = "water"
turns = 6
guesses = ""

print("Let's start the guess the work game!")
print("You'll have total of 6 turns to try")
print(" _ " * (len(secret)))

while turns != 0:
    letter = str(input("\n Enter your letter of guess  >>  ")).lower()
    guesses = guesses + letter[0]
    for letter in secret:
        if letter in guesses:
            print('', letter, '', end='')
        else:
            print(' _ ', end='')
    turns -= 1
    print("\n You've got ",turns," left.")
    if guesses == secret: #need some improvement
        print("\n You guessed the word!")
        break
if turns == 0 and guesses != secret:
    print("\n You lost the game! Good luck next time!")
print(" \n End of game!")
