continue_prog = True
valid_marks = [0, 20, 40, 60, 80, 100, 120]

def input_prompt(level):
    global level_input
    prompt = "Please enter your credits at " + level + ":"
    level_input = input(prompt)
    validate(level_input)
    if validation != "validated":
        input_prompt(level)
    else:
        return(level_input)

def validate(marks):
    global validation
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
    print(validation)
    return(validation)

def outcome(mark1,mark2,mark3):
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
    global continue_prog
    print("Would you like to enter another set of data?")
    control = input("Enter 'y' for yes or 'q' to quit and view results:").lower()
    while control != "y" or "q":
        if control == "y":
            continue_prog = True
            return
        else:
            continue_prog = False
            return
    

while continue_prog == True:
    input_prompt("pass")
    pass_marks = int(level_input)
    input_prompt("defer")
    defer_marks = int(level_input)
    input_prompt("fail")
    fail_marks = int(level_input)

    outcome(pass_marks,defer_marks,fail_marks)

    control()