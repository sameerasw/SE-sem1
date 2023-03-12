file_path = 'SD1\\day-06-file_handling\\student.txt'

#opening file and writing lines
f = open(file_path, 'w')
f.write('joe 10 15 20 30 40\n')
f.write('bill 23 16 19 22\n')
f.write('sue 8 22 17 14 32 17 24 21 2 9 11 17\n')
f.write('grace 12 28 21 45 26 10\n')
f.write('john 14 32 25 16 89\n')
f.close()

#filtering the students with more than 6 quiz scores
fread = open(file_path, 'r')
for aline in fread:
    items = aline.split()
    if len(items[1:]) > 6:
        print("\nStudent(s) with more than 6 quiz scores:",items[0])
fread.close()