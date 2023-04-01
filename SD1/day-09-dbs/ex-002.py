import sqlite3


db = sqlite3.connect(
    'c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/ex-002.db')
cursor = db.cursor()

cursor.execute('''
CREATE TABLE IF NOT EXISTS students(id INTEGER PRIMARY KEY, name TEXT, location TEXT)
''')  # creating the db if not exist
db.commit()

cursor.execute('''
INSERT INTO students(name, location) VALUES("bob","London"),("Jack","Colombo"),("Tom","DC")
''')  # inline intert

students2 = [(4, "Sam", "Mumbai"), (5, "Rahul", "Delhi")]

cursor.executemany('''
INSERT INTO students(id, name, location) VALUES(?,?,?)
''', students2)  # multiple insert

text = cursor.execute('''
SELECT * FROM students
''')  # selecting all from db

for row in text:
    print(row)

cursor.execute('''
DELETE from students where id=2
''')  # deleting the index 2
db.commit()

for names in cursor.execute('''
SELECT name FROM students
'''):  # selecting names form the db
    print(names)

cursor.execute('''
UPDATE students SET location = "Kandy" WHERE name = "Sam"
''')  # changed a value
db.commit()

for names in cursor.execute('''
SELECT * FROM students
'''):  # selecting names form the db
    print(names)

db.close()
