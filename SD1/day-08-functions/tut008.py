cart = []


def showCart():
    """Prints items in cart"""
    if cart != []:
        print("Here is your cart: ")
        for item in cart:
            print(item)
    else:
        print("Your cart is empty")


def addItem(item):
    """Takes item and appends it to cart"""
    cart.append(item)
    print(item + " was added")


def removeItem(item):
    """Takes item and removes it from the cart"""
    if item in cart:
        cart.remove(item)
        print(item + " was removed")
    else:
        print(item + " could not be removed")


def clearCart():
    """Clears items from cart and prints that cart is empty"""
    cart.clear()
    print("Your cart is now empty")


def main():
    done = False

    while not done:
        ans = input("quit/add/remove/show/clear: ").lower()
        if ans == "quit":
            print("Thanks for using the program.")
            showCart()
            done = True
        elif ans == "add":
            item = input("What would you like to add? ").title()
            addItem(item)
        elif ans == "remove":
            item = input("What would you like to remove? ").title()
            removeItem(item)
        elif ans == "show":
            showCart()
        elif ans == "clear":
            clearCart()
        else:
            print("Sorry that was not an option.")


main()
