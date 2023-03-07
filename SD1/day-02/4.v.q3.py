cost_of_item = float(input("How much does the item costs? "))
cash_paid = float(input("Paid amount? "))
change = cash_paid-cost_of_item
if change>0:
    print("The change is ", change, ".Thank You!")
else:
    print("You don't have a change.Thank You!")