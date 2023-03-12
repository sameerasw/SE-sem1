file_path = 'SD1\\day-06-file_handling\\shopping.txt'

#writing to file
f = open(file_path, 'w')                #with write mode, the file will be created if it doesn't exist
f.write("Bread 1 1.39\nTomatoes 6 0.26\nMilk 3 1.45")
f.close()

#reading from file
with open(file_path, 'r') as fread:
	lines = fread.readlines()

#printing the output
for line in lines:  
        words = line.split()            #split the line into words
        number = int(words[1])          #convert the string to int (only the quantity)
        cost = float(words[2])          #onvert the string to float (only the cost)
        print(f'Item {words[0]} = total {number * cost}')