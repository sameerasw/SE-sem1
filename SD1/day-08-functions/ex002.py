sports = ["baseball", "football", "hockey", "basketball"]
def change(alist):
    alist[0] = 'soccer'

print("Before Altering " + str(sports))
change(sports)
print("After Altering " + str(sports))