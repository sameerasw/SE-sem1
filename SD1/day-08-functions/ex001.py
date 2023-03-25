def b():                    # b is a function so it runs only when called
    a = 99                  # a is a local variable
    print(a)

a = 42                      # a is a global variable
print(a)
b()
print(a)
