# I declare that my work contains no examples of misconduct, such as plagiarism, or collusion.    
# Any code taken from other sources is referenced within my code solution.  
# Student ID: w1986636         
# Date: 19.04.2023

# variable declaration
continue_prog = True
valid_marks = [0, 20, 40, 60, 80, 100, 120]
histogram = {'Progress': 0, 'Progress (module trailer)': 0,
             'Do not progress – module retriever': 0, 'Exclude': 0}
outcome_count = 0
results = {}


def input_prompt(level):
    '''Input prompt that will take user inputs and send to the validate function and then return if valid'''
    prompt = "Please enter your credits at " + level + ":"
    level_input = input(prompt)
    validation = validate(level_input)
    while validation != "validated":
        print(validation)
        level_input = input(prompt)
        validation = validate(level_input)
    return (int(level_input))


def validate(marks):
    '''Gets the user input data from the input_prompt function and then return the result'''
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
    return (validation)


def outcome(mark1, mark2, mark3):
    '''Calculate the progression outcome accourding to the input credits if the total is correct.'''
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
    return (outcome)


def control():
    '''This is the loop control that will determine if the program shoud reset and run again.'''
    print("Would you like to enter another set of data?")
    control_input = input(
        "Enter 'y' for yes or 'q' to quit and view results:").lower()
    while control_input != "y" and control_input != "q":
        print("Invalid input.")
        control_input = input(
            "Enter 'y' for yes or 'q' to quit and view results:").lower()
    if control_input == "y":
        continue_prog = True
        print()
    else:
        continue_prog = False
        print()
    return (continue_prog)


def history(outcome):
    '''Increments the value in of the apropirate item in the hostogram.'''
    histogram[outcome] = histogram.get(outcome, 0) + 1


def history_print(outcome_count):
    '''Outputs the Histogram section independently'''
    print("---------------------------------------------------------------")
    print("Histogram")

    for key, value in histogram.items():
        print(f"{key:<35}{value:^5}{':':^5}{ '*'*value:<5}")

    for key, value in histogram.items():
        outcome_count = outcome_count + value

    print(outcome_count, "outcomes in total.")
    print("---------------------------------------------------------------\n")


def result_list(student_id, list, outcome_str, pass_marks, defer_marks, fail_marks):
    '''Saves the input - output pairs in a dictionary (Part 4).'''
    result = {student_id: {"outcome": outcome_str,
                           "pass": pass_marks, "defer": defer_marks, "fail": fail_marks}}
    list.update(result)


# This is the main execution, depends on the control function.
while continue_prog == True:
    student_id = input("Enter the student id: ")
    pass_marks = input_prompt("pass")
    defer_marks = input_prompt("defer")
    fail_marks = input_prompt("fail")

    outcome_str = outcome(pass_marks, defer_marks, fail_marks)
    print("\n", outcome_str, "\n")

    if outcome_str != "Total incorrect.":
        history(outcome_str)
        result_list(student_id, results, outcome_str,
                    pass_marks, defer_marks, fail_marks)

    continue_prog = control()

# printing the outcome summary
history_print(outcome_count)

# printing results from dictionary
for id in results:
    print(id, ":", results[id].get("outcome"), "-", results[id].get("pass"),
          ",", results[id].get("defer"), ",", results[id].get("fail"))
