print("Welcome to Pizzeria! \nSelect an option from the menu below: \na:   Add a topping \nr:   Remove a topping \no:   Order the current pizza \nq:   Quit the program \ns:   Start the current pizza over")
while True:
    print("What would you like to do? \nadd, remove, order, quit, startover:")
    choice = input().lower
    choices = choice.append(choice)
    if choice == "a":
        print("What topping would you like to add?")
        topping = input()
        print("The toppings on your pizza are:", topping)
    elif choice == "r":
        print("What topping would you like to remove?")
        topping = input()
        toppings = toppings.append(topping)
        #topping = topping.remove
        print("The toppings on your pizza are:", topping)