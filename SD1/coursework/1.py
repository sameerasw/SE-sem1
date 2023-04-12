continue_prog = True
valid_marks = [0, 20, 40, 60, 80, 100, 120]


def input_prompt(level):
    prompt = "Please enter your credits at " + level + ":"
    level_input = input(prompt)
    validation = validate(level_input)
    while validation != "validated":
        print(validation)
        level_input = input(prompt)
        validation = validate(level_input)
    return(int(level_input))


def validate(marks):
    try:
        int(marks)
        if 120 < int(marks) > 0:
            validation = "Out of range."
        elif int(marks) not in valid_marks:
            validation = "Invalid marks"
        else:
            validation = "validated"
    except:
        validation = "Integer required"
    return(validation)


def outcome(mark1, mark2, mark3):
    if mark1 + mark2 + mark3 != 120:
        outcome = "Total incorrect."
    else:
        if fail_marks >= 80:
            outcome = "Exclude"
        elif pass_marks <= 80:
            outcome = "Do not progress – module retriever"
        elif pass_marks == 100:
            outcome = "Progress (module trailer)"
        else:
            outcome = "Progress"
    print(outcome)


def control():
    print("Would you like to enter another set of data?")
    control_input = input("Enter 'y' for yes or 'q' to quit and view results:").lower()
    while control_input != "y" and control_input != "q":
        print("Invalid input.")
        control_input = input("Enter 'y' for yes or 'q' to quit and view results:").lower()
    if control_input == "y":
        continue_prog = True
    elif control_input == "q":
        continue_prog = False
    return(continue_prog)

while continue_prog == True:
    pass_marks = input_prompt("pass")
    defer_marks = input_prompt("defer")
    fail_marks = input_prompt("fail")

    outcome(pass_marks, defer_marks, fail_marks)

    continue_prog = control()
